package com.a_srp.good_code.productapp.service;

import com.a_srp.good_code.productapp.dao.Product;
import com.a_srp.good_code.productapp.dao.ProductDao;
import com.a_srp.good_code.productapp.dao.ProductDaoJdbcImpl;

public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;

    public ProductServiceImpl() {
        this.productDao = new ProductDaoJdbcImpl();
    }

    @Override
    public void addProduct(Product product) {
        //ccc: sec tx logging caching

        productDao.saveProduct(product);
    }
}
