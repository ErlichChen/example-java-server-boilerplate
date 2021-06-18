package com.ccc.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pro")
public class HelloProServiceImpl implements HelloService {

    @Override
    public String send() {
        return "The product server in running on port: ";
    }
}
