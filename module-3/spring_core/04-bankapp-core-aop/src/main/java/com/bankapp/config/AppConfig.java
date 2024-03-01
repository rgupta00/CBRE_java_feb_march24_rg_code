package com.bankapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.bankapp")
@EnableAspectJAutoProxy //hey spring u need to integrate with AspectJ
public class AppConfig {
}
