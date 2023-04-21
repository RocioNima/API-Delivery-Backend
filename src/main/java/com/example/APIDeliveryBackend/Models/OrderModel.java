package com.example.APIDeliveryBackend.Models;

import java.time.LocalDateTime;
import java.util.List;

public class OrderModel {

    private Integer id;
    private String customerName;
    private String customerEmail;
    private String status;
    private LocalDateTime creationTime;

    private LocalDateTime estimatedDeliveryTime;

    private List<FoodModel> items;

    public OrderModel(Integer id, String customerName, String customerEmail, String status, LocalDateTime creationTime, LocalDateTime estimatedDeliveryTime, List<FoodModel> items) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.creationTime = creationTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(LocalDateTime estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public List<FoodModel> getItems() {
        return items;
    }

    public void setItems(List<FoodModel> items) {
        this.items = items;
    }
}
