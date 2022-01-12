package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.Models.PInventory;
import project.Models.product_class.GPU;
import project.serviceInterfaces.IBasicProductService;

import java.util.List;

@RestController
@RequestMapping("/GPU")
public class GPUController {

    @Autowired
    IBasicProductService logic;

    @Autowired
    IInventoryRepo inv;

    @GetMapping
    public ResponseEntity<List<GPU>> getAllGPUs(){
        List<GPU> test = null;
        test = logic.getAllGPU();
        return ResponseEntity.ok().body(test);
    }

    @PostMapping()
    public ResponseEntity createGPU(@RequestBody GPU gpu){
        logic.AddBasicProduct(gpu);
        inv.save(new PInventory(gpu,10));
        return new ResponseEntity(HttpStatus.OK);
    }



}
