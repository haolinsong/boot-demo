package com.tutorial.boot_demo.service;

import com.tutorial.boot_demo.converter.StudentConverter;
import com.tutorial.boot_demo.dao.Student;
import com.tutorial.boot_demo.dao.StudentRepository;
import com.tutorial.boot_demo.dto.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentsDTO getStudentById(long id) {
        Student student = studentRepository.findById(id).orElseThrow(RuntimeException::new);
        //convertStudentsDTO定义的是静态方法，不需要注入了
        return StudentConverter.convertStudentsDTO(student);
     }

    @Override
    public Long addNewStudent(StudentsDTO studentsDTO) {
        List<Student> studentList = studentRepository.findByEmail(studentsDTO.getEmail());
        if (!CollectionUtils.isEmpty(studentList)) {
            throw new IllegalStateException("email" + studentsDTO.getEmail() + "has been taken");
        }
        Student student = studentRepository.save(StudentConverter.convertStudentsDTO(studentsDTO));
        return student.getId();
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id" + id + " is not exist"));
        studentRepository.deleteById(id);
    }
}
 