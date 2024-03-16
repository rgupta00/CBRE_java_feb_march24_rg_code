package com.authserver;

import com.authserver.entity.UserEntity;
import com.authserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class AuthserverApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

//	@Autowired
//	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(AuthserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userService.addUser(new UserEntity("raj","raj123",
				Arrays.asList("ROLE_ADMIN","ROLE_USER")));

		userService.addUser(new UserEntity("ekta","raj123",
				Arrays.asList("ROLE_USER")));

		UserEntity userEntity=userService.findByUsername("raj");
		System.out.println(userEntity);
	}
}
