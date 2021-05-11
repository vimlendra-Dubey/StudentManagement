package com.database.studentmanagement.services;

import com.database.studentmanagement.entity.Student;
import com.database.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public Student findStudentById(int id)
    {
        return studentRepository.getStudentById(id);
    }

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }
}
