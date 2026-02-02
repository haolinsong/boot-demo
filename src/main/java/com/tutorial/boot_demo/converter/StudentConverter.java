package com.tutorial.boot_demo.converter;

import com.tutorial.boot_demo.dao.Student;
import com.tutorial.boot_demo.dto.StudentsDTO;

public class StudentConverter {
    public static StudentsDTO convertStudentsDTO(Student student) {
        StudentsDTO studentsDTO = new StudentsDTO();
        studentsDTO.setId(student.getId());
        studentsDTO.setName(student.getName());
        studentsDTO.setEmail(student.getEmail());
        return studentsDTO;
    }

    public static Student convertStudentsDTO(StudentsDTO studentDTO) {
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        return student;
    }


}
