package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.stereotype.Service;
@Service
public class CountryService {
    private Country country;
    public CountryService(Country country) {
        this.country = country;
    }
    public Country getCountry(){
        return country;
    }

}

