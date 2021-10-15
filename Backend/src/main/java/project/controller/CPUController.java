package project.controller;

import project.classes.product_class.CPU;
import project.fakedatabase.FakeCPUData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.logic.CPUManager;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/CPU")
public class CPUController {

    private FakeCPUData fake = new FakeCPUData();
    private CPUManager data = new CPUManager(fake);

@GetMapping
public ResponseEntity<List<CPU>> getAllCPUs(){
List <CPU> test = null;

test = data.GetAllCPUs();

if(test != null){
    return ResponseEntity.ok().body(test);
}
else {
    return ResponseEntity.notFound().build();
}
}

@GetMapping("/Name/{name}")
public ResponseEntity<List<CPU>> getCPUByName(@PathVariable(value = "name") String name) {
    List<CPU> cpu = data.GetAllCPUsByName(name);
    if (cpu != null) {
        return ResponseEntity.ok().body(cpu);
    } else {
        return ResponseEntity.notFound().build();
    }
}

@GetMapping("/Brand/{brand}")
    public ResponseEntity<List<CPU>> getCPUByBrand(@PathVariable(value = "brand") String brand){
    List<CPU> cpu = data.GetAllCPUsByBrand(brand);

    if(cpu != null){
        return ResponseEntity.ok().body(cpu);
    }
    else {
        return ResponseEntity.notFound().build();
    }
}

}
