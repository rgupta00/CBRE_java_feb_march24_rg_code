package com.productapp.config;

import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import com.productapp.util.DtoConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
//@Component: @Service @Controller @RestController  @Repository
@Component
public class DbInit implements CommandLineRunner {

    private Logger logger= LoggerFactory.getLogger(DbInit.class);
    @Autowired
    private ProductService productService;
    @Override
    public void run(String... args) throws Exception {
        logger.info("-------------db init----------");

        Product p1 = new Product("laptop", BigDecimal.valueOf(120000));
        Product p2 = new Product("laptop coolpad", BigDecimal.valueOf(1200));
        productService.addProduct(DtoConverter.productToDto(p1));
        productService.addProduct(DtoConverter.productToDto(p2));
    }
}
