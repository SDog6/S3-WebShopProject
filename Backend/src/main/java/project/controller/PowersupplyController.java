package project.controller;

import project.classes.Powersupply;
import project.fakedatabase.FakePartsData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/PowerSupply")
public class PowersupplyController {


    private static final FakePartsData data = new FakePartsData();


    @GetMapping
    public ResponseEntity<List<Powersupply>> getAllPowersupply(){
        List <Powersupply> test = null;

        test = data.GetAllPowersupplies();

        if(test != null){
            return ResponseEntity.ok().body(test);

        }
        else {
            return ResponseEntity.notFound().build();

        }
    }

}
