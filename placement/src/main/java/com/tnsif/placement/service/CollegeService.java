package com.tnsif.placement.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placement.entity.CollegeEntity;
import com.tnsif.placement.repository.CollegeRepository;


@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepo;

    public CollegeEntity saveCollege(CollegeEntity college) {
        return collegeRepo.save(college);
    }

    public CollegeEntity getCollegeById(int id) {
        Optional<CollegeEntity> college = collegeRepo.findById(id);
        return college.orElse(null);
    }

    public boolean deleteCollege(int id) {
        if (collegeRepo.existsById(id)) {
            collegeRepo.deleteById(id);
            return true;
        }
        return false;
    }

    public List<CollegeEntity> getAllColleges() {
        return collegeRepo.findAll();
    }

    public CollegeEntity updateCollege(int id, CollegeEntity college) {
        if (collegeRepo.existsById(id)) {
            college.setId(id);
            return collegeRepo.save(college);
        }
        return null;
    }

    public boolean existsById(int id) {
        return collegeRepo.existsById(id);
    }
}