package com.example.CountryCode.controller;

import com.example.CountryCode.model.Country;
import com.example.CountryCode.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    CountryService service;
    public CountryController(CountryService service){
        this.service = service;
    }
    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code){
        return service.getCountry(code);
    }

}
