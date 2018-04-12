package com.myangular.javaserver.backendjava.model;

public class Product {

    Integer id;
    String title;
    Double price;
    Float rating;
    String shortDescription;
    String description;
    String[] categories;

    public Product(Integer id, String title, Double price, Float rating, String shortDescription, String description, String[] categories) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.shortDescription = shortDescription;
        this.description = description;
        this.categories = categories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }
}
