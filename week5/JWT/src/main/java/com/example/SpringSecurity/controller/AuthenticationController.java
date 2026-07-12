package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.AuthenticationResponse;
import com.example.SpringSecurity.service.AuthenticationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    AuthenticationService service;
    AuthenticationController(AuthenticationService service){
        this.service = service;
    }
    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(@RequestHeader("Authorization") String authHeader){
        return service.authenticate(authHeader);
    }
}
