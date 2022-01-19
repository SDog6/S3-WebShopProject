package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.Models.PInventory;
import project.Models.product_class.RAM;
import project.serviceInterfaces.IBasicProductService;

import java.util.List;

@RestController
@RequestMapping("/RAM")
public class RamController {

    @Autowired
    IBasicProductService logic;

    @Autowired
    IInventoryRepo inv;

    @GetMapping
    public ResponseEntity<List<RAM>> getAllRAMs(){
        List<RAM> test = null;
        test = logic.getAllRAM();
        return ResponseEntity.ok().body(test);
    }

    @PostMapping()
    public ResponseEntity createRAM(@RequestBody RAM r){
        try{
            logic.AddBasicProduct(r);
            inv.save(new PInventory(r,10));
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
    }

}
