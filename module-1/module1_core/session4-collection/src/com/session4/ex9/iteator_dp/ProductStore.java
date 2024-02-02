package com.session4.ex9.iteator_dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductStore implements Iterable<Product> {

    private List<Product> products=new LinkedList<>();

    public void addProduct( Product product) {
        products.add(product);
    }
    @Override
    public Iterator<Product> iterator() {

        return new ProductIterator();
    }

    class ProductIterator implements  Iterator<Product>{
        int currIndex=0;

        @Override
        public boolean hasNext() {
            if(currIndex >=products.size())
                return false;
            else
            return true;
        }

        @Override
        public Product next() {
            return products.get(currIndex++);
        }
        @Override
        public void remove() {
            products.remove(--currIndex);
        }
    }
}
