package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.bankapp"})
//@PropertySource(value = "classpath:foo.properties")
public class DbConfig {
    @Autowired
    private DbProp dbProp;

    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();

        dataSource.setUsername(dbProp.getUsername());
        dataSource.setPassword(dbProp.getPassword());
        dataSource.setUrl(dbProp.getUrl());
        dataSource.setDriverClassName(dbProp.getDriverClassName());
        return dataSource;
    }
}
