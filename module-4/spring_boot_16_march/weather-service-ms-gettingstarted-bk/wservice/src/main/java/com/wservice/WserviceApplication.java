package com.wservice;

import com.wservice.dto.AppInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@EnableConfigurationProperties(AppInfoDto.class)
@SpringBootApplication
public class WserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WserviceApplication.class, args);
	}

}
