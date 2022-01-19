package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Models.Order;
import project.repositoryInterfaces.IOrderRepo;
import project.serviceInterfaces.IOrderService;

import java.util.List;
@Service
public class OrderService implements IOrderService {

    IOrderRepo repo;
    @Autowired
    public OrderService(IOrderRepo repo){
        this.repo = repo;
    }

    @Override
    public List<Order> getOrdersByUsername(String username) {
        return repo.getOrdersByUsername(username);
    }

    @Override
    public boolean CreateOrder(Order r) {
        return  repo.CreateOrder(r);
    }

    @Override
    public List<Order> getAllOrders() {
        return repo.getAllOrders();
    }
}
