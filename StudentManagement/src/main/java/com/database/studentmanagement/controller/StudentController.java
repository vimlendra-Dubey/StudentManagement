package com.database.studentmanagement.controller;

import com.database.studentmanagement.entity.Student;
import com.database.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;



    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED );
    }

    @GetMapping("/show")
    public Iterable<Student> showAllStudent(){
        return studentService.findAll();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id){
        return new ResponseEntity<Student>(studentService.findStudentById(id), HttpStatus.OK);
    }

}
