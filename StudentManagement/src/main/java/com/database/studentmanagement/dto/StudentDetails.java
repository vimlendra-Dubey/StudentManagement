package com.database.studentmanagement.dto;

import com.database.studentmanagement.entity.Student;

public class StudentDetails {

    private Student student;

    public StudentDetails() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentDetails(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "student=" + student +
                '}';
    }
}
