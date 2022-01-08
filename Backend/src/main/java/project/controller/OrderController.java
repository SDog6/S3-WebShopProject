package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.DBAccessInterfaces.IOrder;
import project.Models.Order;
import project.Models.PInventory;
import project.Models.product_class.parent_class.BasicProduct;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    IOrder logic;

    @Autowired
    IInventoryRepo inventory;


    @GetMapping
    public ResponseEntity<List<Order>> GetOrders(){
        List <Order> test = null;
        test = logic.findAll();
        return ResponseEntity.ok().body(test);
    }

    @GetMapping("/ByUser")
    public ResponseEntity<List<Order>> GetOrdersByUsername(@RequestBody String username){
        List <Order> test = null;
        test = logic.getOrdersByUsername(username);

        return ResponseEntity.ok().body(test);
    }

    @PostMapping()
    public ResponseEntity CreateOrder(@RequestBody Order temp){
        List<BasicProduct> orderedItems = new ArrayList<>();
        for (BasicProduct product:temp.getProducts()) {
           PInventory check =  inventory.getByProduct_Id(product.getId());
           if (check.getAmount() >= product.getCount()){
               int newamount = check.getAmount() - product.getCount();
               check.setAmount(newamount);
               inventory.save(check);
               orderedItems.add(product);
           }
        }
        if (orderedItems.size()>0){
            logic.save(new Order(orderedItems,temp.getUsername(),temp.getPrice()));
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.CONFLICT);
    }
}
