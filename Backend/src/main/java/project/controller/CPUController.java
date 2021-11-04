package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.classes.product_class.CPU;
import project.data_access.ICPURepo;
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

System.out.println(test);

if(test != null){
    return ResponseEntity.ok().body(test);
}
else {
    return ResponseEntity.notFound().build();
}
}

@GetMapping("/Name/{name}")
public ResponseEntity<CPU> getCPUByName(@PathVariable(value = "name") String name) {
    CPU cpu = data.GetSingleCPUByName(name);
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
