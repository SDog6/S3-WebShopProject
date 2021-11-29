package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.DTO.product_class.CPU;
import project.interfaces.ICPURepo;
import project.fakedatabase.FakeCPUData;
import project.logic.CPUManager;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/CPU")
public class CPUController {

    private FakeCPUData fake = new FakeCPUData();
    private CPUManager data = new CPUManager(fake);


    @Autowired
    ICPURepo repository;

@GetMapping
public ResponseEntity<List<CPU>> getAllCPUs(){
List <CPU> test = null;

test = repository.findAll();
    return ResponseEntity.ok().body(test);
}

@GetMapping("/Name/{name}")
public ResponseEntity<CPU> getCPUByName(@PathVariable(value = "name") String name) {
    CPU cpu = repository.GetCPUByName(name);
    if (cpu != null) {
        return ResponseEntity.ok().body(cpu);
    } else {
        return ResponseEntity.notFound().build();
    }
}

}
