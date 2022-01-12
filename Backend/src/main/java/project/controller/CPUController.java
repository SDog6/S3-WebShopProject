package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DBAccessInterfaces.IInventoryRepo;
import project.Models.PInventory;
import project.Models.product_class.CPU;
import project.serviceInterfaces.IBasicProductService;

import java.util.List;

@RestController
@RequestMapping("/CPU")
public class CPUController {

    @Autowired
    IBasicProductService logic;
    @Autowired
    IInventoryRepo inv;

@GetMapping
public ResponseEntity<List<CPU>> getAllCPUs(){
List <CPU> test = null;

test = logic.getAllCPU();
    return ResponseEntity.ok().body(test);
}

@PostMapping()
    public ResponseEntity createCPU(@RequestBody CPU cpu){
     logic.AddBasicProduct(cpu);
     inv.save(new PInventory(cpu,10));
    return new ResponseEntity(HttpStatus.OK);
}

}
