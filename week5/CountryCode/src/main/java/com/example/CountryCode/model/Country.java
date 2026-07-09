package com.example.CountryCode.model;

import jdk.jfr.Enabled;


public class Country {
    private String name;
    private String code;
    Country(){

    }
    Country(String name, String code){
        this.code = code;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }

}
