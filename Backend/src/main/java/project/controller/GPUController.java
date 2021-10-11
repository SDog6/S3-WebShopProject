package project.controller;

import project.classes.GPU;
import project.fakedatabase.FakePartsData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/GPU")
public class GPUController {


    private static final FakePartsData data = new FakePartsData();


    @GetMapping
    public ResponseEntity<List<GPU>> getAllGPUs(){
        List <GPU> test = null;

        test = data.GetAllGPUs();

        if(test != null){
            return ResponseEntity.ok().body(test);

        }
        else {
            return ResponseEntity.notFound().build();

        }
    }

}
