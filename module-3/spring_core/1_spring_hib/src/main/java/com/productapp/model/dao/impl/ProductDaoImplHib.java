package com.productapp.model.dao.impl;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.dao.ProductDao;
import com.productapp.model.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Primary
public class ProductDaoImplHib implements ProductDao {

    //here we need to inject session factory
    private SessionFactory sessionFactory;

    @Autowired
    public ProductDaoImplHib(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //OpenSession vs getCurrentSession : hibernate interview Questions?*
    //Session in view pattern *

    //helper method ?
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    @Override
    public List<Product> getAll() {
        return getSession().createQuery("select p from Product p", Product.class).getResultList();
    }

    @Override
    public Product addProduct(Product product) {
        getSession().persist(product);//Who will maage tx? spring d
        return product;
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        Product productToUpdate=getProductById(productId);
        productToUpdate.setPrice(product.getPrice());
        getSession().update(productToUpdate);
        return productToUpdate;
    }

    @Override
    public Product deleteProduct(int productId) {
        Product productToDelete=getProductById(productId);
        getSession().remove(productToDelete);
        return productToDelete;
    }

    @Override
    public Product getProductById(int productId) {
        Product product=getSession().get(Product.class, productId);

        if(product==null)
            throw new ProductNotFoundException("product not found");

        return product;
    }
}
