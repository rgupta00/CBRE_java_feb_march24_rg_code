package com.wclient;

import com.wclient.dto.AppInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableConfigurationProperties(AppInfoDto.class)
@SpringBootApplication
public class WclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WclientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
