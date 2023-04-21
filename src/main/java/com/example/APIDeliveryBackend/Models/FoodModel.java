package com.example.APIDeliveryBackend.Models;

public class FoodModel {

private String name;
private String description;
private double prices;

    public FoodModel(String name, String description, double prices) {
        this.name = name;
        this.description = description;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }


}