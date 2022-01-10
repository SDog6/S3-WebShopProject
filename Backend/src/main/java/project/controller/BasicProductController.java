package project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.DBAccessInterfaces.productAccess.IBasicProductRepo;
import project.Models.product_class.CPU;
import project.Models.product_class.GPU;
import project.Models.product_class.parent_class.BasicProduct;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/BasicProduct")
public class BasicProductController {

    @Autowired
    IBasicProductRepo logic;

    @GetMapping
    public ResponseEntity<List<BasicProduct>> getAllBasicProducts(){
        List <BasicProduct> test = null;
        test = logic.findAll();
        return ResponseEntity.ok().body(test);
    }

    @GetMapping("/testGPU")
    public ResponseEntity<List<GPU>> getallSpecific(){
        List <BasicProduct> test = null;
        List <GPU> testGPU = null;
        test = logic.findAll();
        for (BasicProduct p : test) {
            if (p instanceof GPU){
                GPU temp = (GPU)p;
                testGPU.add(temp);
            }
        }
        return ResponseEntity.ok().body(testGPU);
    }


    @GetMapping("/testCPU")
    public ResponseEntity<List<CPU>> getallSpecificcc(){
        List <BasicProduct> test = null;
        List <CPU> testGPU = new ArrayList<>();
        test = logic.findAll();
        for (BasicProduct p : test) {
            if (p instanceof CPU){
                CPU temp = (CPU)p;
                testGPU.add(temp);
            }
        }
        return ResponseEntity.ok().body(testGPU);
    }
}
