package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.Models.Order;
import project.serviceInterfaces.IOrderService;

import java.util.List;


@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    IOrderService logic;



    @GetMapping
    public ResponseEntity<List<Order>> GetOrders(){
        List <Order> test = null;
        test = logic.getAllOrders();
        return ResponseEntity.ok().body(test);
    }

    @GetMapping("/ByUser/{username}")
    public ResponseEntity<List<Order>> GetOrdersByUsername(@PathVariable(value = "username") String username){
        List <Order> test = null;
        test = logic.getOrdersByUsername(username);
        return ResponseEntity.ok().body(test);
    }

    @PostMapping()
    public ResponseEntity CreateOrder(@RequestBody Order temp){
       if (logic.CreateOrder(temp)){
           return ResponseEntity.ok(HttpStatus.OK);
       }
        return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
    }
}
