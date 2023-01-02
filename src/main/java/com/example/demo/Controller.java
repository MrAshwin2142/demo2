package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello(){
        return "hello evryone....(*_*)";
    }

    @GetMapping("/wellcome")
    public String wellcome(){
        return "wellcome.....(*_*)";
    }

}
