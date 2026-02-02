package com.tutorial.boot_demo.controller;

import com.tutorial.boot_demo.dao.Student;
import com.tutorial.boot_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }
}
