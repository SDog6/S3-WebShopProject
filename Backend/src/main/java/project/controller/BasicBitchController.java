package project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.DBAccessInterfaces.IBasicProductRepo;
import project.Models.product_class.parent_class.BasicProduct;

import java.util.List;

@RestController
@RequestMapping("/BasicProduct")
public class BasicBitchController {

    @Autowired
    IBasicProductRepo logic;

    @GetMapping
    public ResponseEntity<List<BasicProduct>> getAllBasicProducts(){
        List <BasicProduct> test = null;
        test = logic.findAll();
        return ResponseEntity.ok().body(test);
    }
}
