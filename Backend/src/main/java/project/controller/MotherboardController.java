//package project.controller;
//
//import project.DTO.product_class.Motherboard;
//import project.fakedatabase.FakeMotherboardData;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import project.service.MotherboardManager;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/Motherboard")
//public class MotherboardController {
//
//    private FakeMotherboardData fake = new FakeMotherboardData();
//    private MotherboardManager data = new MotherboardManager(fake);
//
//    @GetMapping
//    public ResponseEntity<List<Motherboard>> getAllMotherb(){
//        List <Motherboard> test = null;
//
//        test = data.GetAllMotherboards();
//
//
//        if(test != null){
//            return ResponseEntity.ok().body(test);
//
//        }
//        else {
//            return ResponseEntity.notFound().build();
//
//        }
//    }
//
//}
