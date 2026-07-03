package com.example.Spring_Hello.service;

import com.example.Spring_Hello.model.Country;
import org.springframework.stereotype.Service;
@Service
public class CountryService {
    private Country country;
    public CountryService(Country country){
        this.country = country;
    }
    public Country displayCountry() {
        return country;
    }
}
