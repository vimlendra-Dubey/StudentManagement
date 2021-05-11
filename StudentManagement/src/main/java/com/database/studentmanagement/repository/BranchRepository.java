package com.database.studentmanagement.repository;

import com.database.studentmanagement.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer> {
     Branch getBranchById(int id);
}
