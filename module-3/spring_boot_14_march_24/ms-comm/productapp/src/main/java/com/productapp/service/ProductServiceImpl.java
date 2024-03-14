package com.productapp.service;

import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Cacheable(value="products")
    @Override
    public List<Product> findAll() {
        System.out.println("------------------------------");
        return productRepo.findAll();
    }

    @Cacheable(value="products", key = "#id")
    @Override
    public Product getById(int id) {
        return productRepo.
                findById(id)
                .orElseThrow(()->new ProductNotFoundException("product with id "+id +" is not found"));
    }
    @CachePut(value="products", key="#result.id")
    @Override
    public Product addProduct(Product product) {
        productRepo.save(product);
        return product;
    }

    @CachePut(value="products", key="#result.id")
    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate=getById(id);
        productToUpdate.setPrice(product.getPrice());
        productRepo.save(productToUpdate);
        return productToUpdate;
    }

    @CacheEvict(value="products", key="#id")
    @Override
    public Product deleteProduct(int id) {
        Product productToDelete=getById(id);
        productRepo.delete(productToDelete);
        return productToDelete;
    }

    //http://localhost:8090/productapp/products?sort=price
    @Override
    public List<Product> getAllProductSorted(String field) {
        return productRepo.findAll(Sort.by(Sort.Direction.DESC, field));
    }

    //productpage?offset=4&pageSize=20
    @Override
    public Page<Product> getAllProductPage(int offset, int pageSize) {
        return productRepo.findAll(PageRequest.of(offset, pageSize));
    }

    @Override
    public Page<Product> getAllProductPageSorted(String field, int offset, int pageSize) {
        return productRepo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
    }
    @CacheEvict(value="products", allEntries=true)
    @Override
    public void invalidateCache() {
        System.out.println("-----------cache is cleared----------------");
    }
}
