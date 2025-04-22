package com.example.resortmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resortmanagement.model.Resort;
import com.example.resortmanagement.repository.ResortRepository;

@Service
public class ResortService {

    @Autowired
    private ResortRepository resortRepository;

    // Method to add a new resort to the database
    public void addResort(Resort resort) {
        resortRepository.save(resort);
    }

    // Method to fetch all resorts
    public List<Resort> getAllResorts() {
        return resortRepository.findAll();
    }
}
