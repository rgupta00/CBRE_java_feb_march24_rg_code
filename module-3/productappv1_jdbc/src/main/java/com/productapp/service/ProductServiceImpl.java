package com.productapp.service;

import com.productapp.dao.Product;
import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoImpl;
import com.productapp.exceptions.DataAccessException;
import com.productapp.exceptions.ProductNotFoundExcetion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;
    private Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);

    public ProductServiceImpl(){
        productDao=new ProductDaoImpl();
    }
    @Override
    public List<Product> getAll() {
      try{
          List<Product>products= productDao.getAll();
          return products;
      }catch (DataAccessException e){
          logger.error("some database error "+ e.getMessage());
          throw  e;
      }
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
        productDao.deleteProduct(id);
    }

    @Override
    public void updateProduct(int id, Product product) {

        productDao.updateProduct(id, product);
    }

    @Override
    public Product getById(int id) {
        Product product=productDao.getById(id);
        if(product==null){
            throw new ProductNotFoundExcetion("product with id "+ id +" is not found");
        }
        return product;
    }
}
