package com.database.studentmanagement.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name ="Clg_id")
    private College college;

    @ManyToOne
    @JoinColumn(name ="Branch_id")
    private Branch branch;


    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @JsonBackReference(value = "stu_clg")
    //@JsonManagedReference(value = "stu_clg")
    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    @JsonBackReference(value = "stu_branch")
    //@JsonManagedReference(value = "stu_branch")
   // @JsonIgnore
    //@JsonManagedReference
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

}
