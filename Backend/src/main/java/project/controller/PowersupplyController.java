package project.controller;

import project.classes.product_class.Powersupply;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.fakedatabase.FakePowersupplyData;
import project.logic.PowersupplyManager;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/PowerSupply")
public class PowersupplyController {


    private FakePowersupplyData fake = new FakePowersupplyData();
    private PowersupplyManager data = new PowersupplyManager(fake);


    @GetMapping
    public ResponseEntity<List<Powersupply>> getAllPowersupply(){
        List <Powersupply> test = null;

        test = data.GetAllPowersupplys();

        if(test != null){
            return ResponseEntity.ok().body(test);

        }
        else {
            return ResponseEntity.notFound().build();

        }
    }

}
