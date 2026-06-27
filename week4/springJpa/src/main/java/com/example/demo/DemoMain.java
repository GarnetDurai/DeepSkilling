package com.example.demo;
import com.example.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoMain implements CommandLineRunner{
    @Autowired
    private studentService service;
    @Override
    public void run(String... args){
        service.addStudent("Garnet", 21);
    }

}
