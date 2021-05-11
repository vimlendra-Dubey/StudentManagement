package com.database.studentmanagement.entity;


import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.List;


@Entity
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String branchId;
    private String branchName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branch", fetch = FetchType.LAZY)
    private List<Student> studentFromBranch;

    @ManyToOne
    private College branchInCollege;

    public Branch() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @JsonManagedReference(value = "stu_branch")
    //@JsonBackReference(value = "stu_branch")
    public List<Student> getStudentFromBranch() {
        return studentFromBranch;
    }

    public void setStudentFromBranch(List<Student> studentFromBranch) {
        this.studentFromBranch = studentFromBranch;
    }

   // @JsonManagedReference(value = "clg_branch")
    @JsonBackReference(value = "clg_branch")
    public College getBranchInCollege() {
        return branchInCollege;
    }

    public void setBranchInCollege(College branchInCollege) {
        this.branchInCollege = branchInCollege;
    }
}
