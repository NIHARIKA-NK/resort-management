package com.example.resortmanagement.controller;

import com.example.resortmanagement.model.Booking;
import com.example.resortmanagement.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ViewbookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/my_bookings")
    public String getUserBookings(@RequestParam String email, Model model) {
        List<Booking> userBookings = bookingRepository.findByEmail(email);
        model.addAttribute("bookings", userBookings);
        model.addAttribute("userEmail", email); // For reuse in page
        return "my_bookings"; // Name of your Thymeleaf HTML template
    }
}
