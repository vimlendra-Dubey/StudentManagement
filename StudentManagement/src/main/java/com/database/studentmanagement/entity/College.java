package com.database.studentmanagement.entity;

import com.fasterxml.jackson.annotation.*;


import javax.persistence.*;
import java.util.List;

@Entity
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String clgName;
    private String clgLocation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "college", fetch = FetchType.LAZY)
    private List<Student> students;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "branchInCollege", fetch = FetchType.LAZY)
    private List<Branch> branches;


    public College() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getClgLocation() {
        return clgLocation;
    }

    public void setClgLocation(String clgLocation) {
        this.clgLocation = clgLocation;
    }

    @JsonManagedReference(value = "stu_clg")
    @JsonIgnore
    //@JsonBackReference(value = "stu_clg")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    //@JsonBackReference(value = "clg_branch")
    @JsonManagedReference(value = "clg_branch")
    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}
