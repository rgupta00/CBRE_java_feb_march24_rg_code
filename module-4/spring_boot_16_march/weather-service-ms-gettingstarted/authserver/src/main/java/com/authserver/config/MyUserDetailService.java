package com.authserver.config;

import com.authserver.entity.UserEntity;
import com.authserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailService implements UserDetailsService {

	
	private UserService userService;
	
	@Autowired
	public MyUserDetailService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity=userService.findByUsername(username);
		
		System.out.println("---------------------------------");
		System.out.println(userEntity);
		
		System.out.println("---------------------------------");
		if(userEntity==null)
			throw new UsernameNotFoundException("username/password is not correct");

		return new SecUser(userEntity);
	}

}









