package com.bankapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Config class => xml
//aka bootstrap class
@Configuration
//spring +AspectJ
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.bankapp")
public class AppConfig {
}
