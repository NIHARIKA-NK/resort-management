package com.example.resortmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resortmanagement.model.Facility;
import com.example.resortmanagement.repository.FacilityRepository;

@Service
public class FacilityService {

    @Autowired
    private FacilityRepository facilityRepository;

    public List<Facility> getAllFacilities() {
        return facilityRepository.findAll();
    }

    public Facility saveFacility(Facility facility) {
        return facilityRepository.save(facility);
    }

    public Optional<Facility> getFacilityById(Integer id) {
        return facilityRepository.findById(id);
    }

    public void deleteFacility(Integer id) {
        facilityRepository.deleteById(id);
    }
}
