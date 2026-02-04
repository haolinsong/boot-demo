package com.tutorial.boot_demo.service;

import com.tutorial.boot_demo.dao.Student;
import com.tutorial.boot_demo.dto.StudentsDTO;

public interface StudentService {
    StudentsDTO getStudentById(long id);

    Long addNewStudent(StudentsDTO studentsDTO);

    void deleteStudentById(long id);

    StudentsDTO updatestudentByID(long id, String name, String email);
}
