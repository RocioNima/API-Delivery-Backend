package com.example.APIDeliveryBackend.Controllers;


import com.example.APIDeliveryBackend.Models.FoodModel;
import com.example.APIDeliveryBackend.Models.OrderModel;
import com.example.APIDeliveryBackend.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/foods")
    public List<FoodModel> getFoods() {
        return orderService.getFoods();
    }

    @GetMapping("/getOrders")
    public List<OrderModel> getOrders(){
        return orderService.getOrders();
    }

    @PostMapping("/addOrder")
    public String createOrder(@RequestBody OrderModel order) {
        // Save the order to the database
       return orderService.addOrder(order);
    }

    @GetMapping("getOrderId/{id}")
    public OrderModel getOrderById(@PathVariable Integer id) {
        // Obtener un pedido por ID
        return orderService.getOrderById(id);
    }

    @DeleteMapping("deleteOrder/{orderId}")
    public ResponseEntity<String> deleteOrder(@PathVariable Integer orderId) {
        orderService.deleteOrder(orderId);
        return ResponseEntity.ok("Pedido eliminado con éxito");
    }

}