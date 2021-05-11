package com.database.studentmanagement.controller;

import com.database.studentmanagement.entity.Branch;
import com.database.studentmanagement.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping("add")
    public ResponseEntity<Branch> addBranch(@RequestBody Branch branch) {
        return new ResponseEntity<Branch>(branchService.saveBranch(branch), HttpStatus.CREATED);
    }

    @GetMapping("/show")
    public Iterable<Branch> showAllBranch() {

        return branchService.findAll();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Branch> getBranchById(@PathVariable int id) {
        return new ResponseEntity<Branch>(branchService.findBranchById(id), HttpStatus.OK);
    }
}
