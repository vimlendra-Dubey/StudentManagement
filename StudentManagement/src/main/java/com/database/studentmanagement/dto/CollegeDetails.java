package com.database.studentmanagement.dto;

import com.database.studentmanagement.entity.College;

public class CollegeDetails {

    private College college;

    public CollegeDetails() {
    }

    public CollegeDetails(College college) {
        this.college = college;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "CollegeDetails{" +
                "college=" + college +
                '}';
    }
}
