package com.example.resortmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.resortmanagement.model.Facility;
import com.example.resortmanagement.repository.FacilityRepository;

@Controller
@RequestMapping("/admin/facilities")
public class AdminFacilityController {

    @Autowired
    private FacilityRepository facilityRepo;

    // Create Facility
    @GetMapping("/new")
    public String showCreateFacilityForm(Model model) {
        model.addAttribute("facility", new Facility());
        return "admin/create_facility";  // View for creating a new facility
    }

    @PostMapping("/create")
    public String createFacility(@ModelAttribute Facility facility) {
        facilityRepo.save(facility);
        return "redirect:/admin/facilities";  // Redirect to the list of facilities
    }

    // List Facilities
    @GetMapping
    public String listFacilities(Model model) {
        model.addAttribute("facilities", facilityRepo.findAll());
        return "admin/facilities";  // View for listing facilities
    }

    // Update Facility
    @GetMapping("/edit/{id}")
    public String showUpdateFacilityForm(@PathVariable Integer id, Model model) {
        Facility facility = facilityRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Facility not found"));
        model.addAttribute("facility", facility);
        return "admin/edit_facility";  // View for editing a facility
    }

    @PostMapping("/update/{id}")
    public String updateFacility(@PathVariable Integer id, @ModelAttribute Facility facility) {
        facility.setId(id);  // Now the types match
        facilityRepo.save(facility);
        return "redirect:/admin/facilities";  // Redirect to the list of facilities
}

    // Delete Facility
    @GetMapping("/delete/{id}")
    public String deleteFacility(@PathVariable Integer id) {
        facilityRepo.deleteById(id);
        return "redirect:/admin/facilities";  // Redirect to the list of facilities
    }
}
