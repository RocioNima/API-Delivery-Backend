package com.example.APIDeliveryBackend.Services;


import com.example.APIDeliveryBackend.Models.FoodModel;
import com.example.APIDeliveryBackend.Models.OrderModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    //Variable que almacena un conjunto de elementos en un array
    private List<OrderModel> orders = new ArrayList<>();

    //Obtener pedidos.
    public List<OrderModel> getOrders() {
        //Listar en Array...
        return orders;
    }

    // Obtener los alimentos
    public List<FoodModel> getFoods(){
        // Return a list of available foods
        List<FoodModel> menu = new ArrayList<>();
        menu.add(new FoodModel("Hamburger", "A delicious hamburger", 5.99));
        menu.add(new FoodModel("Pizza", "A cheesy pizza", 8.99));
        menu.add(new FoodModel("Salad", "A healthy salad", 4.99));
        return menu;
    }

    public String addOrder(OrderModel order){
        // Añades un elemento en la lista.
        orders.add(order);

        //Muestras el mensaje en formato JSON
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode response = mapper.createObjectNode();
        response.put("mensaje", "Datos Guardados");
        response.put("status", "201");
        return response.toString();
    }

    public OrderModel getOrderById(long id) {
        for (OrderModel order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public void deleteOrder(Integer orderId) {
        orders.removeIf(order -> order.getId().equals(orderId));
    }

}
