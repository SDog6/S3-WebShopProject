package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.Models.product_class.CPU;
import project.serviceInterfaces.ICPUService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/CPU")
public class CPUController {

    @Autowired
    ICPUService logic;

@GetMapping
public ResponseEntity<List<CPU>> getAllCPUs(){
List <CPU> test = null;

test = logic.GetAllCPUs();
    return ResponseEntity.ok().body(test);
}

@GetMapping("/Name/{name}")
public ResponseEntity<CPU> getCPUByName(@PathVariable(value = "name") String name) {
    CPU cpu = logic.GetCPUByName(name);
    if (cpu != null) {
        return ResponseEntity.ok().body(cpu);
    } else {
        return ResponseEntity.notFound().build();
    }
}

@PostMapping()
    public ResponseEntity createCPU(@RequestBody CPU cpu){
     logic.AddCPU(cpu);
    return new ResponseEntity(HttpStatus.OK);
}

}
