package project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.classes.product_class.CPU;
import project.logic.UserService;
import project.security.JWTAuthenticationFilter;
import project.security.UserCreateRequest;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    JWTAuthenticationFilter filter;

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserCreateRequest userCreateRequest) {
        userService.createUser(userCreateRequest);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/account")
    public ResponseEntity<CPU> getCPUByName(@PathVariable(value = "name") String name) {
        return null;
    }


//    @PostMapping("/login")
//    public ResponseEntity login(@RequestBody UserCreateRequest userCreateRequest) {
//        filter.attemptAuthentication(userCreateRequest);
//
//    }
}
