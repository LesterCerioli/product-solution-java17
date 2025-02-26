package com.example.products.domain.models;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.is = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }
}
