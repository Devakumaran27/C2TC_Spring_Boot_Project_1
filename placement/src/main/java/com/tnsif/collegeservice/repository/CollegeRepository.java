package com.tnsif.collegeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnsif.collegeservice.entity.CollegeEntity;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, Integer> {
    
}
