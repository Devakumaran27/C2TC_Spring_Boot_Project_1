package com.tnsif.collegeservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "colleges")
public class CollegeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "university")
    private String university;
    
    @Column(name = "principal_name")
    private String principalName;
    
    @Column(name = "established_year")
    private int establishedYear;
    
    @Column(name = "student_count")
    private int studentCount;
    
    @Column(name = "accreditation")
    private String accreditation;

    // Default constructor
    public CollegeEntity() {
    }

    // Parameterized constructor
    public CollegeEntity(String name, String location, String university, String principalName, 
                        int establishedYear, int studentCount, String accreditation) {
        this.name = name;
        this.location = location;
        this.university = university;
        this.principalName = principalName;
        this.establishedYear = establishedYear;
        this.studentCount = studentCount;
        this.accreditation = accreditation;
    }

    // --- Getters & Setters ---

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }

    public String getPrincipalName() {
        return principalName;
    }
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }
    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getAccreditation() {
        return accreditation;
    }
    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }
}