package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.Models.PInventory;
import project.Models.product_class.Powersupply;
import project.serviceInterfaces.IBasicProductService;

import java.util.List;

@RestController
@RequestMapping("/PowerSupply")
public class PowersupplyController {

    @Autowired
    IBasicProductService logic;

    @Autowired
    IInventoryRepo inv;

    @GetMapping
    public ResponseEntity<List<Powersupply>> getAllPowers(){
        List<Powersupply> test = null;
        test = logic.getAllPowersupplies();
        return ResponseEntity.ok().body(test);
    }

    @PostMapping()
    public ResponseEntity createGPU(@RequestBody Powersupply p){
        logic.AddBasicProduct(p);
        inv.save(new PInventory(p,10));
        return new ResponseEntity(HttpStatus.OK);
    }

}
