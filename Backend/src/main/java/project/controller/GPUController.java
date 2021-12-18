package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.serviceInterfaces.IGPUService;

@RestController
@RequestMapping("/GPU")
public class GPUController {

    @Autowired
    IGPUService logic;


}
