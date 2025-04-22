package com.example.resortmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.resortmanagement.model.Resort;
import com.example.resortmanagement.repository.ResortRepository;

@Controller
@RequestMapping("/admin/resorts")
public class AdminResortController {

    @Autowired
    private ResortRepository resortRepo;

    // Create Resort
    @GetMapping("/new")
    public String showCreateResortForm(Model model) {
        model.addAttribute("resort", new Resort());
        return "admin/create_resort";  // View for creating a new resort
    }

    @PostMapping("/create")
    public String createResort(@ModelAttribute Resort resort) {
        resortRepo.save(resort);
        return "redirect:/admin/resorts";  // Redirect to the list of resorts
    }

    // List Resorts
    @GetMapping
    public String listResorts(Model model) {
        model.addAttribute("resorts", resortRepo.findAll());
        return "admin/resorts";  // View for listing resorts
    }

    // Update Resort
    @GetMapping("/edit/{id}")
    public String showUpdateResortForm(@PathVariable Long id, Model model) {
        Resort resort = resortRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Resort not found"));
        model.addAttribute("resort", resort);
        return "admin/edit_resort";  // View for editing a resort
    }

    @PostMapping("/update/{id}")
public String updateResort(@PathVariable Long id, @ModelAttribute Resort resort) {
    Resort existingResort = resortRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Resort not found"));
    
    // If there are fields that need to be updated manually, update them here:
    existingResort.setName(resort.getName());
    existingResort.setLocation(resort.getLocation());
    // Add other fields you want to update
    
    resortRepo.save(existingResort);  // Save the updated resort
    return "redirect:/admin/resorts";  // Redirect to the list of resorts
}

    // Delete Resort
    @GetMapping("/delete/{id}")
    public String deleteResort(@PathVariable Long id) {
        resortRepo.deleteById(id);
        return "redirect:/admin/resorts";  // Redirect to the list of resorts
    }
}
