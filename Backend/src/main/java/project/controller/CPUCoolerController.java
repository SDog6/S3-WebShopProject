//package project.controller;
//
//
//import project.DTO.product_class.CPUCooling;
//import project.fakedatabase.FakeCPUCoolingData;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import project.service.CPUCoolingManager;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/CPUCooler")
//public class CPUCoolerController {
//
//
//    private FakeCPUCoolingData fake = new FakeCPUCoolingData();
//    private CPUCoolingManager data = new CPUCoolingManager(fake);
//
//
//    @GetMapping
//    public ResponseEntity<List<CPUCooling>> getAllCPUCoolers(){
//        List <CPUCooling> test = null;
//
//        test = data.GetAllCPUCoolings();
//
//        if(test != null){
//            return ResponseEntity.ok().body(test);
//        }
//        else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//}
