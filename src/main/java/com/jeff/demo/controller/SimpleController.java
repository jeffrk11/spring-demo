package com.jeff.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    
    @GetMapping("/hello")
    public String  helloWorld(){
        return "hello world 😎";
    }
}
