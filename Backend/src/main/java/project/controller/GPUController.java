//package project.controller;
//
//import project.DTO.product_class.GPU;
//import project.fakedatabase.FakeGPUData;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import project.service.GPUManager;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/GPU")
//public class GPUController {
//
//
//    private FakeGPUData fake = new FakeGPUData();
//    private GPUManager data = new GPUManager(fake);
//
//
//    @GetMapping
//    public ResponseEntity<List<GPU>> getAllGPUs(){
//        List <GPU> test = null;
//
//        test = data.GetAllGPUs();
//        if(test != null){
//            return ResponseEntity.ok().body(test);
//        }
//        else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//}
