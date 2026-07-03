package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    private CountryService service;
    public CountryController(CountryService service){
        this.service = service;
    }
    @GetMapping("/country")
    public Country getCountryIndia(){
        return service.getCountry();
    }
}
