package project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.Models.PInventory;

import java.util.List;

@RestController
@RequestMapping("/Inventory")
public class InventoryController {
    @Autowired
    IInventoryRepo logic;

    @GetMapping
    public ResponseEntity<List<PInventory>> getInventory(){
        List <PInventory> test = null;
        test = logic.findAll();
        return ResponseEntity.ok().body(test);
    }

    @PostMapping("/IncreaseAmount/{prodId}/{amount}")
    public ResponseEntity IncreaseAmount(@PathVariable(value = "prodId") Long ss,@PathVariable(value = "amount") int amount){
        PInventory increase = logic.getByProduct_Id(ss);
        increase.setAmount(increase.getAmount() + amount);
        logic.save(increase);
        return new ResponseEntity(HttpStatus.OK);
    }
}
