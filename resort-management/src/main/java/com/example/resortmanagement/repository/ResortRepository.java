package com.example.resortmanagement.repository;

import com.example.resortmanagement.model.Resort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResortRepository extends JpaRepository<Resort, Long> {
}
