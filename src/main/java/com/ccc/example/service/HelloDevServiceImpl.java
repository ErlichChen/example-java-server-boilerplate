package com.ccc.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class HelloDevServiceImpl implements HelloService {

    @Override
    public String send() {
        return "The dev server in running on port: ";
    }
}
