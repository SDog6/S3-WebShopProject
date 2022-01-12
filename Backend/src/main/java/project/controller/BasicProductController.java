package project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.Models.product_class.parent_class.BasicProduct;
import project.serviceInterfaces.IBasicProductService;

import java.util.List;

@RestController
@RequestMapping("/BasicProduct")
public class BasicProductController {

    @Autowired
    IBasicProductService logic;

    @GetMapping
    public ResponseEntity<List<BasicProduct>> getAllBasicProducts(){
        List <BasicProduct> test = null;
        test = logic.getAllProucts();
        return ResponseEntity.ok().body(test);
    }


    @GetMapping("/Name/{name}")
    public ResponseEntity<BasicProduct> getProductByName(@PathVariable(value = "name") String name) {
        BasicProduct basic = logic.GetSingleBasicProduct(name);
        if (basic != null) {
            return ResponseEntity.ok().body(basic);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
