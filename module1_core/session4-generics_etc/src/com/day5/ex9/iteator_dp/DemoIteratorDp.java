package com.day5.ex9.iteator_dp;

import java.util.Iterator;
import java.util.List;

public class DemoIteratorDp {
    public static void main(String[] args) {


        ProductStore productStore=new ProductStore();
        productStore.addProduct(new Product(1,"laptop",89000.00));
        productStore.addProduct(new Product(41,"laptop cover",890.00));
        productStore.addProduct(new Product(110,"rich dad poor dad",120.00));

        Iterator<Product> it=productStore.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
