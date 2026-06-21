package com.example.service;
import com.example.entity.Student;
import com.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
    @Autowired
    private Repository repo;

    public void addStudent(String name, int age){
        Student s = new Student(name, age);
        repo.save(s);
    }
}
