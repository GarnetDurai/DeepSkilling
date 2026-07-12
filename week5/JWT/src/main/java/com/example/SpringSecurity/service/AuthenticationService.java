package com.example.SpringSecurity.service;
import java.util.Base64;

import com.example.SpringSecurity.jwt.JwtUtil;
import com.example.SpringSecurity.model.AuthenticationResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private AuthenticationManager authenticationManager;
    private JwtUtil jwt;
    public AuthenticationService(AuthenticationManager authenticationManager, JwtUtil jwt){
        this.authenticationManager = authenticationManager;
        this.jwt = jwt;
    }

    public AuthenticationResponse authenticate(String authHeader){
        String encoded = authHeader.substring(6);
        String decoded = new String(Base64.getDecoder().decode(encoded.getBytes()));
        String a[] = decoded.split(":");
        String name = a[0];
        String pass = a[1];
       Authentication authenticationRequest = new UsernamePasswordAuthenticationToken(name, pass);
       try {
           authenticationManager.authenticate(authenticationRequest);
           String jwtToken = jwt.generateToken(name);
           return new AuthenticationResponse(jwtToken);
       }catch (AuthenticationException e){
           throw e;
       }

    }

}
