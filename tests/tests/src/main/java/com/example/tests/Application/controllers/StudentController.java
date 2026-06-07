package com.example.tests.Application.controllers;

import com.example.tests.Domain.entity.Student;
import com.example.tests.External.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/list")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @PostMapping("/add")
    public String addStudent() {
        return "Student Added";
    }
}