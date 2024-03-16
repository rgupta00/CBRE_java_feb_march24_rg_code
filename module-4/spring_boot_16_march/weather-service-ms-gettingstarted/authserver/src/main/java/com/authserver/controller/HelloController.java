package com.authserver.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import com.authserver.config.JwtService;
import com.authserver.dto.AuthRequest;
import com.authserver.dto.UserRegRequest;
import com.authserver.entity.UserEntity;
import com.authserver.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

     @Autowired
	private UserService userService;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/register")
	public String addNewUser(@RequestBody UserRegRequest userRegRequest) {
		UserEntity userEntity=new UserEntity();
		userEntity.setPassword(userRegRequest.getPassword());
		userEntity.setUsername(userRegRequest.getUsername());
		userEntity.setRoles(Arrays.asList("ROLE_USER"));
		 userService.addUser(userEntity);
		 return "user register successfully";
	}

	@GetMapping("/validate")
	public String validateToken(@RequestParam("token") String token) {
		try{
			jwtService.validateToken(token);
		}catch (Exception e) {
		    throw new UsernameNotFoundException("invalid user");
		}
		return "Token is valid";
	}

	@PostMapping(path = "authenticate")
	public String authenticate(@RequestBody AuthRequest authRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		if (authentication.isAuthenticated()) {
			return jwtService.generateToken(authRequest.getUsername());
		}else {
			throw new UsernameNotFoundException("invalid user");
		}
	}
}
