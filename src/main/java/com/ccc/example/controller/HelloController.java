package com.ccc.example.controller;

import com.ccc.example.bean.Local;
import com.ccc.example.bean.Locals;
import com.ccc.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @Value("${info.project.version}")
    private String version;

    @Autowired
    private Local local;

    @Autowired
    private Locals locals;

    @Autowired
    private HelloService service;

    @GetMapping("/hello")
    public String helloHandler()  {
        return service.send() + port + " version: " + version;
    }

    @GetMapping("/port")
    public String portHandler()  {
        return service.send() + port;
    }

    @GetMapping("/version")
    public String versionHandler()  {
        return " version: " + version;
    }

    @GetMapping("/local")
    public String localHandler()  {
        return "local: " + local.getKey1() + local.getKey2();
    }

    @GetMapping("/locals")
    public String localsHandler()  {
        return "locals: " + locals.getKeys();
    }
}
