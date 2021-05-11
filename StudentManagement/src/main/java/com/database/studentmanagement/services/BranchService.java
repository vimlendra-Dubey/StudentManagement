package com.database.studentmanagement.services;

import com.database.studentmanagement.entity.Branch;
import com.database.studentmanagement.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public Branch saveBranch(Branch branch){
        return branchRepository.save(branch);
    }

    public Branch findBranchById(int id){
        return branchRepository.getBranchById(id);
    }

    public Iterable<Branch> findAll() {
        List<Branch> list = branchRepository.findAll();
        System.out.println(list);
        return branchRepository.findAll();

    }
}
