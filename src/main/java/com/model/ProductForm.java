package com.model;

import org.springframework.web.multipart.MultipartFile;

public class ProductForm {
    private Long id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private MultipartFile image;

    private Category category;

    public ProductForm() {
    }

    public ProductForm(String name, double price, int quantity, String description, MultipartFile image, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
        this.category = category;
    }

    public ProductForm(Long id, String name, double price, int quantity, String description, MultipartFile image, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
