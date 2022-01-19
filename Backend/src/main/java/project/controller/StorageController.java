package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.Models.PInventory;
import project.Models.product_class.Storage;
import project.serviceInterfaces.IBasicProductService;

import java.util.List;

@RestController
@RequestMapping("/Storage")
public class StorageController {

    @Autowired
    IBasicProductService logic;

    @Autowired
    IInventoryRepo inv;

    @GetMapping
    public ResponseEntity<List<Storage>> getAllStorages(){
        List<Storage> test = null;
        test = logic.getAllStorage();
        return ResponseEntity.ok().body(test);
    }

    @PostMapping()
    public ResponseEntity createStorage(@RequestBody Storage s){
        try{
            logic.AddBasicProduct(s);
            inv.save(new PInventory(s,10));
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
    }


}
