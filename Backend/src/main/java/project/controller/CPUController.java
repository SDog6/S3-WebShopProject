package project.controller;

import project.classes.product_class.CPU;
import project.fakedatabase.FakePartsData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/CPU")
public class CPUController {

private static final FakePartsData data = new FakePartsData();

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
    List<CPU> cpu = data.SearchCPUByName(name);
    if (cpu != null) {
        return ResponseEntity.ok().body(cpu);
    } else {
        return ResponseEntity.notFound().build();
    }
}

@GetMapping("/Brand/{brand}")
    public ResponseEntity<List<CPU>> getCPUByBrand(@PathVariable(value = "brand") String brand){
    List<CPU> cpu = data.SearchCPUByBrand(brand);

    if(cpu != null){
        return ResponseEntity.ok().body(cpu);
    }
    else {
        return ResponseEntity.notFound().build();
    }
}

}
