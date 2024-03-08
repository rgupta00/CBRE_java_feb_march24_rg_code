package com.productapp.service;

import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;
import com.productapp.exceptions.ResourceNotFoundException;
import com.productapp.repo.ProductRepo;
import com.productapp.util.DtoConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;
    private Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<ProductDto> findAll() {
        return productRepo.findAll().stream().map(DtoConverter::productToDto).toList();
    }

    @Override
    public ProductDto getById(int id) {
        return productRepo.
                findById(id)
                .map(DtoConverter::productToDto)
                .orElseThrow(()->new ResourceNotFoundException("product with id "+id +" is not found"));
    }

    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Product productToSave=DtoConverter.productDtoToProduct(productDto);
        productRepo.save(productToSave);
        ProductDto productDtToReturn= DtoConverter.productToDto(productToSave);

        logger.info("product is added to db {}", productToSave);

        return productDtToReturn;

    }

    @Override
    public ProductDto updateProduct(int id, ProductDto product) {
        ProductDto productDtoToUpdate=getById(id);
        productDtoToUpdate.setPrice(product.getPrice());

        Product productToUpdate= DtoConverter.productDtoToProduct(productDtoToUpdate);
        productRepo.save(productToUpdate);

        return productDtoToUpdate;
    }

    @Override
    public ProductDto deleteProduct(int id) {
        ProductDto productDtoToDelete=getById(id);
        Product productToDelete= DtoConverter.productDtoToProduct(productDtoToDelete);
        productRepo.delete(productToDelete);
        return productDtoToDelete;
    }
}
