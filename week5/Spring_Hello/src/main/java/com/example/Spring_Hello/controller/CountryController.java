package com.example.Spring_Hello.controller;

import com.example.Spring_Hello.model.Country;
import com.example.Spring_Hello.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    private CountryService service;
    public CountryController(CountryService service){
        this.service = service;
    }
    @GetMapping("/country")
    public Country myCountry(){
        return service.displayCountry();
    }


}
