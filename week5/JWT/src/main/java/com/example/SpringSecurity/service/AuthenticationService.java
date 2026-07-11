package com.example.SpringSecurity.service;
import java.util.Base64;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private AuthenticationManager authenticationManager;
    public AuthenticationService(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
    }
    public String authenticate(String authHeader){
        String encoded = authHeader.substring(6);
        String decoded = new String(Base64.getDecoder().decode(encoded.getBytes()));
        String a[] = decoded.split(":");
        String name = a[0];
        String pass = a[1];
       Authentication token = new UsernamePasswordAuthenticationToken(name, pass);
       try{
           Authentication authentication = authenticationManager.authenticate(token);
           //Generate JWT
       }catch (AuthenticationException e){

        }
        return "name : "+name +"\npass : "+pass;
    }

}
