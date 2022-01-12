//package project.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import project.DBAccessInterfaces.IInventoryRepo;
//import project.Models.PInventory;
//import project.Models.product_class.GPU;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/GPU")
//public class GPUController {
//
//    @Autowired
//    IGPUService logic;
//
//    @Autowired
//    IInventoryRepo inv;
//
//    @GetMapping
//    public ResponseEntity<List<GPU>> getAllGPUs(){
//        List <GPU> test = null;
//        test = logic.GetAllGPUs();
//        return ResponseEntity.ok().body(test);
//    }
//
//
//    @GetMapping("/Name/{name}")
//    public ResponseEntity<GPU> getGPUByName(@PathVariable(value = "name") String name) {
//        GPU gpu = logic.GetGPUByName(name);
//        if (gpu != null) {
//            return ResponseEntity.ok().body(gpu);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping()
//    public ResponseEntity createGPU(@RequestBody GPU gpu){
//        logic.AddGPU(gpu);
//        inv.save(new PInventory(gpu,10));
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//
//
//}
