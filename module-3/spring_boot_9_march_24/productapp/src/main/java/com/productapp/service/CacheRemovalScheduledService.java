package com.productapp.service;

import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CacheRemovalScheduledService {

    @Autowired
    private ProductService productService;

    @Scheduled(cron = "0,30 * * * * *")
    public void cleanCache(){
        productService.invalidateCache();
    }
}
