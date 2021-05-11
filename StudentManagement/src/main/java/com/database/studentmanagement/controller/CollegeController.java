package com.database.studentmanagement.controller;

import com.database.studentmanagement.entity.College;
import com.database.studentmanagement.services.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/College")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping("add")
    public ResponseEntity<College> addCollege(@RequestBody College college){
        return new ResponseEntity<College>(collegeService.saveCollege(college), HttpStatus.CREATED);
    }

    @GetMapping("/show")
    public Iterable<College> showAllCollege(){
        return collegeService.findAll();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable int id){
        return new ResponseEntity<College>(collegeService.findCollegeById(id), HttpStatus.OK);
    }

}
