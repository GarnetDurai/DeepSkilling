package com.example.Spring_Hello.controller;

import com.example.Spring_Hello.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Service service;
    Controller(Service service){
        this.service = service;
    }
    @GetMapping("/hello")
    public String printHello(){
        return service.print();
    }
}
