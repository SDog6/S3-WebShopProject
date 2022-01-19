package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.service.UserService;
import project.security.UserCreateRequest;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity createUser(@RequestBody UserCreateRequest userCreateRequest) {
        if(userService.createUser(userCreateRequest)){
            return ResponseEntity.ok(HttpStatus.OK);
        }
        else {
            return ResponseEntity.ok(HttpStatus.CONFLICT);
        }
    }

}
