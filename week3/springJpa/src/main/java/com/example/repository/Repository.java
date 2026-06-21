package com.example.repository;
import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Repository extends JpaRepository<Student, Long> {

}
