package project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.Models.PInventory;
import project.Models.product_class.CPUCooling;
import project.serviceInterfaces.IBasicProductService;

import java.util.List;

@RestController
@RequestMapping("/CPUCooler")
public class CPUCoolerController {


    @Autowired
    IBasicProductService logic;

    @Autowired
    IInventoryRepo inv;

    @GetMapping
    public ResponseEntity<List<CPUCooling>> getAllCoolerss(){
        List<CPUCooling> test = null;
        test = logic.getAllGPUCooling();
        return ResponseEntity.ok().body(test);
    }

    @PostMapping()
    public ResponseEntity createCooler(@RequestBody CPUCooling cooling){
        logic.AddBasicProduct(cooling);
        inv.save(new PInventory(cooling,10));
        return new ResponseEntity(HttpStatus.OK);
    }


}
