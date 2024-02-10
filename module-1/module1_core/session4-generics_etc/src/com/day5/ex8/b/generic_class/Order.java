package com.day5.ex8.b.generic_class;

import java.util.Comparator;
import java.util.StringJoiner;

public class Order implements Comparable<Order> {
    private int id;
    private String name;
    private double price;

    public Order(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
