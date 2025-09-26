package com.tnsif.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnsif.placement.entity.CollegeEntity;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, Integer> {
    
}
