package com.example.demo.controllers;

import com.example.demo.beans.SaySomethingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaySomethingController {

    @Autowired
    @Qualifier("sayHelloService")
    private SaySomethingService saySomethingService;

    @GetMapping("/")
    public String saySomethingThroughBean() {
        return saySomethingService.saySomething();
    }
}
