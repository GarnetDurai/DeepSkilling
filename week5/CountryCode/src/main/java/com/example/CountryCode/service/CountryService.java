package com.example.CountryCode.service;

import com.example.CountryCode.model.Country;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CountryService {
    ArrayList<Country> l;
    public CountryService(@Qualifier("CountryList") ArrayList<Country>l){
        this.l = l;
    }
    public Country getCountry(String code){
        for(Country c : l){
            if(c.getCode().equals(code)){
                return c;
            }
        }
        return null;
    }
}
