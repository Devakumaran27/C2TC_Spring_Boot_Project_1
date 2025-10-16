package com.tnsif.collegeservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnsif.collegeservice.entity.CollegeEntity;
import com.tnsif.collegeservice.service.CollegeService;


@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @GetMapping
    public ResponseEntity<List<CollegeEntity>> getAllColleges() {
        List<CollegeEntity> colleges = collegeService.getAllColleges();
        return ResponseEntity.ok(colleges);
    }
    
    @PostMapping
    public ResponseEntity<CollegeEntity> createCollege(@RequestBody CollegeEntity college) {
        CollegeEntity savedCollege = collegeService.saveCollege(college);
        return new ResponseEntity<>(savedCollege, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CollegeEntity> getCollegeById(@PathVariable int id) {
        CollegeEntity college = collegeService.getCollegeById(id);
        if (college == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(college);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CollegeEntity> updateCollege(
            @PathVariable("id") int id,   // ✅ specify "id"
            @RequestBody CollegeEntity college
    ) {
        CollegeEntity updated = collegeService.updateCollege(id, college);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCollege(@PathVariable("id") int id) {
        boolean deleted = collegeService.deleteCollege(id);
        if (deleted) {
            return ResponseEntity.ok("College with ID " + id + " deleted successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}