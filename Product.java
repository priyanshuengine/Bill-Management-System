package com.billingsystem;

public class Product {
    String name;
    int quantity;
    double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return name + " x " + quantity + " @ ₹" + price + " = ₹" + (quantity * price);
    }
}