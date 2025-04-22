package com.example.resortmanagement.repository;

import com.example.resortmanagement.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Integer> {
}
