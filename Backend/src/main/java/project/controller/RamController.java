package project.controller;

import project.classes.product_class.RAM;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.fakedatabase.FakeRAMData;
import project.logic.RAMManager;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/RAM")
public class RamController {

    private FakeRAMData fake = new FakeRAMData();
    private RAMManager data = new RAMManager(fake);


    @GetMapping
    public ResponseEntity<List<RAM>> getAllRAM(){
        List<RAM> test = null;

        test = data.GetAllRAMs();

        if(test != null){
            return ResponseEntity.ok().body(test);

        }
        else {
            return ResponseEntity.notFound().build();

        }
    }

}
