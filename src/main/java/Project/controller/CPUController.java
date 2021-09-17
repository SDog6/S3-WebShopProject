package Project.controller;

import Project.classes.CPU;
import Project.fakedatabase.FakePartsData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

@GetMapping("/name/{name}")
public ResponseEntity<List<CPU>> getCPUByName(@PathVariable(value = "name") String name) {
    List<CPU> cpu = data.SearchCPUByName(name);
    if (cpu != null) {
        return ResponseEntity.ok().body(cpu);
    } else {
        return ResponseEntity.notFound().build();
    }
}

}
