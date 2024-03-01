package com.productapp.model.service;

import com.productapp.model.dao.ProductDao;
import com.productapp.model.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serial;
import java.util.List;

@Service(value = "ps")
//which can maanage all tx mgr

@Transactional(isolation = Isolation.READ_COMMITTED)
public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
    @Override
    public Product addProduct(Product product) {
        return productDao.addProduct(product);
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        return productDao.updateProduct(productId, product);
    }

    @Override
    public Product deleteProduct(int productId) {
        return productDao.deleteProduct(productId);
    }

    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }
}
