package Project.controller;

import Project.classes.Storage;
import Project.fakedatabase.FakePartsData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/Storage")
public class StorageController {


    private static final FakePartsData data = new FakePartsData();


    @GetMapping
    public ResponseEntity<List<Storage>> getAllStorage(){
        List <Storage> test = null;

        test = data.GetAllStorages();

        if(test != null){
            return ResponseEntity.ok().body(test);

        }
        else {
            return ResponseEntity.notFound().build();

        }
    }

}
