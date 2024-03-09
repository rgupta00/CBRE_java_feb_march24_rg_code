package com.productapp.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {
    //we need to conffigure cache in memory cache

    @Bean
    public CacheManager cacheManager(){
        //hashmap
        ConcurrentMapCacheManager cacheManager=new
                ConcurrentMapCacheManager("products");
        return cacheManager;
    }
}
