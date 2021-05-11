package com.database.studentmanagement.services;

import com.database.studentmanagement.entity.College;
import com.database.studentmanagement.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;


    public College saveCollege(College college){
        return collegeRepository.save(college);
    }

    public College findCollegeById(int id){
        return collegeRepository.getCollegeById(id);
    }

    public Iterable<College> findAll() {
        return collegeRepository.findAll();

    }
}
