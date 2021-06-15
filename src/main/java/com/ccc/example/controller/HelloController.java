package com.ccc.example.controller;

import com.ccc.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @GetMapping("/hello")
    public String helloHandler()  {
        return service.hello();
    }
}
