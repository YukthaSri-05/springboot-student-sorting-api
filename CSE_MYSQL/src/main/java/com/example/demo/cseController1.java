package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class cseController1 {

    @Autowired
    CseRepo repo;

    // Insert student
    @PostMapping("/cse/insert")
    public CseEntity1 saveData(@RequestBody CseEntity1 data) {
        return repo.save(data);
    }

    // Get all students (unsorted)
    @GetMapping("/cse/getStudents")
    public List<CseEntity1> getStudents() {
        return repo.findAll();
    }

    // ✅ Get students sorted by CGPA (Ascending)
    @GetMapping("/cse/getStudents/cgpa/asc")
    public List<CseEntity1> getStudentsByCgpaAsc() {
        return repo.findAllByOrderByCgpaAsc();
    }

    // ✅ Get students sorted by CGPA (Descending)
    @GetMapping("/cse/getStudents/cgpa/desc")
    public List<CseEntity1> getStudentsByCgpaDesc() {
        return repo.findAllByOrderByCgpaDesc();
    }
}
