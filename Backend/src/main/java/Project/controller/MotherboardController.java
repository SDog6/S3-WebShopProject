package Project.controller;

import Project.classes.Motherboard;
import Project.fakedatabase.FakePartsData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/Motherboard")
public class MotherboardController {

    private static final FakePartsData data = new FakePartsData();

    @GetMapping
    public ResponseEntity<List<Motherboard>> getAllMotherb(){
        List <Motherboard> test = null;

        test = data.GetAllMotherboards();

        if(test != null){
            return ResponseEntity.ok().body(test);

        }
        else {
            return ResponseEntity.notFound().build();

        }
    }

}
