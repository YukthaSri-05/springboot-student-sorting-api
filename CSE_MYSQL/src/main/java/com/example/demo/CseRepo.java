package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CseRepo extends JpaRepository<CseEntity1, Integer> {

    // Sort by CGPA ascending
    List<CseEntity1> findAllByOrderByCgpaAsc();

    // Sort by CGPA descending
    List<CseEntity1> findAllByOrderByCgpaDesc();
}
