package com.example.resortmanagement.controller;

import com.example.resortmanagement.model.Resort;
import com.example.resortmanagement.service.ResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
@Secured("ROLE_ADMIN")  // Ensures that only users with 'ROLE_ADMIN' can access these pages
public class AdminController {

    @Autowired
    private ResortService resortService;

    // Route to view the form for adding a new resort
    @GetMapping("/add-resort")
    public String showAddResortForm(Model model) {
        model.addAttribute("resort", new Resort()); // Passing empty Resort object to the form
        return "admin-add-resorts";  // This will return the admin-add-resorts.html page
    }

    // Route to handle the form submission for adding a new resort
    @PostMapping("/add-resort")
    public String addResort(Resort resort, Model model) {
        resortService.addResort(resort); // Call the service to save the resort
        model.addAttribute("message", "Resort added successfully!");
        return "redirect:/admin/add-resort";  // Redirecting to the form page after success
    }

    // Route to view the list of resorts (you can expand this for more admin functionality)
    @GetMapping("/view-resorts")
    public String viewResorts(Model model) {
        model.addAttribute("resorts", resortService.getAllResorts());  // Assuming you have a service to fetch resorts
        return "admin-view-resorts";  // You can create this HTML page to list resorts
    }
}
