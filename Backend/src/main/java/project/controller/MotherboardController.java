package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.Models.PInventory;
import project.Models.product_class.Motherboard;
import project.serviceInterfaces.IBasicProductService;

import java.util.List;

@RestController
@RequestMapping("/Motherboard")
public class MotherboardController {

    @Autowired
    IBasicProductService logic;

    @Autowired
    IInventoryRepo inv;

    @GetMapping
    public ResponseEntity<List<Motherboard>> getAllGPUs(){
        List<Motherboard> test = null;
        test = logic.getAllMotherboards();
        return ResponseEntity.ok().body(test);
    }

    @PostMapping()
    public ResponseEntity createGPU(@RequestBody Motherboard m){
        try{
            logic.AddBasicProduct(m);
            inv.save(new PInventory(m,10));
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
    }

}
