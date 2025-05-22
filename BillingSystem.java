package com.billingsystem;

import java.util.*;

public class BillingSystem {

    static Scanner sc = new Scanner(System.in);
    static List<Product> cart = new ArrayList<>();
    static double total = 0.0;

    public static void main(String[] args) {
        System.out.println("=== Billing System ===");
        while (true) {
            System.out.println("\n1. Add Product\n2. View Cart\n3. Checkout\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewCart();
                    break;
                case 3:
                    checkout();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addProduct() {
        sc.nextLine(); // consume newline
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter price per unit: ");
        double price = sc.nextDouble();
        cart.add(new Product(name, qty, price));
        total += qty * price;
        System.out.println("Product added.");
    }

    static void viewCart() {
        System.out.println("\n--- Cart Items ---");
        for (Product p : cart) {
            System.out.println(p);
        }
        System.out.printf("Total: ₹%.2f%n", total);
    }

    static void checkout() {
        viewCart();
        System.out.println("Checkout complete. Please collect your bill.");
        cart.clear();
        total = 0.0;
    }
}