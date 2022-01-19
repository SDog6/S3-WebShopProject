package project.serviceInterfaces;

import project.Models.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getOrdersByUsername(String username);
    boolean CreateOrder(Order r);
    List<Order> getAllOrders();
}
