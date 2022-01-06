package project.DBAccessInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import project.Models.Order;

import java.util.List;

public interface IOrder extends JpaRepository<Order,Long> {
    List<Order> getOrdersByUsername(String username);
}
