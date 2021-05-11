package com.database.studentmanagement.repository;

import com.database.studentmanagement.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer> {
    College getCollegeById(int id);

}
