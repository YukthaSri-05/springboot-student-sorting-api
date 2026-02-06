package com.example.demo;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentData")
@JsonPropertyOrder({ "id", "name", "branch", "cgpa", "skills" })
public class CseEntity1{

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String branch;

    @Column
    private int cgpa;

    @ElementCollection
    @CollectionTable(
        name = "student_skills",
        joinColumns = @JoinColumn(name = "student_id")
    )
    @Column(name = "skill")
    private Set<String> skills;


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
    public String getBranch() { 
    	return branch; 
    }
    public void setBranch(String branch) { 
    	this.branch = branch; 
    }

    public int getCgpa() { 
    	return cgpa; 
    }
    public void setCgpa(int cgpa) {
    	this.cgpa = cgpa; 
    }
    public Set<String> getSkills() { 
    	return skills; 
    }
    public void setSkills(Set<String> skills) { 
    	this.skills = skills; 
    }
}
