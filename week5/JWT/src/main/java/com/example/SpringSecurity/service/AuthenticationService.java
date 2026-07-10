package com.example.SpringSecurity.service;
import java.util.Base64;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public String decode(String authHeader){
        String encoded = authHeader.substring(6);
        String decoded = new String(Base64.getDecoder().decode(encoded.getBytes()));
        return decoded;
    }

}
