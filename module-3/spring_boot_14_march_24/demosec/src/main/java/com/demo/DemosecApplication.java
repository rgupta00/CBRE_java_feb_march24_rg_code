package com.demo;

import com.demo.entity.UserEntity;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemosecApplication{
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DemosecApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return (args) ->{
					//userService.addUserEntity(new UserEntity("raj","raj123", List.of("ROLE_MGR","ROLE_CLERK")));
					//userService.addUserEntity(new UserEntity("ekta","ekta123", List.of("ROLE_CLERK")));

		};
	}

}
