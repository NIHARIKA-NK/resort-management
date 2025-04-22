package com.example.resortmanagement.controller;

import com.example.resortmanagement.model.Resort;
import com.example.resortmanagement.repository.ResortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ResortController {

    @Autowired
    private ResortRepository resortRepo;

    @GetMapping("/resorts")
    public String listResorts(Model model) {
    model.addAttribute("resorts", resortRepo.findAll());
    return "resorts"; // This will render 'resorts.html'
}


    @GetMapping("/resort/{id}")
    public String resortDetails(@PathVariable Long id, Model model) {
        Resort resort = resortRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Resort not found"));
        model.addAttribute("resort", resort);
        return "resort_details";
}
}
