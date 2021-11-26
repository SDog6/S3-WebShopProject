package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.logic.UserService;
import project.security.UserCreateRequest;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity createUser(@RequestBody UserCreateRequest userCreateRequest) {
        userService.createUser(userCreateRequest);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/account")
    public ResponseEntity<String> getAccountDetails() {
        return ResponseEntity.ok("nice");
    }

    @GetMapping("/inventory")
    public ResponseEntity<String> getInventory() {
        return ResponseEntity.ok("nice");
    }
}
