package project.repositoryInterfaces;

import project.Models.Order;

import java.util.List;

public interface IOrderRepo {
    List<Order> getOrdersByUsername(String username);
    boolean CreateOrder(Order r);
    List<Order> getAllOrders();
}
