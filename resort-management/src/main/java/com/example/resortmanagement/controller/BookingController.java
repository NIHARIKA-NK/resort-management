package com.example.resortmanagement.controller;

import com.example.resortmanagement.entity.User;
import com.example.resortmanagement.model.Booking;
import com.example.resortmanagement.repository.BookingRepository;

import jakarta.servlet.http.HttpSession;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class BookingController {

    @Autowired
    private BookingRepository bookingRepo;

    @GetMapping("/book")
public String showBookingForm(@RequestParam String resortName, Model model, HttpSession session) {
    User user = (User) session.getAttribute("loggedInUser");

    if (user == null) {
        return "redirect:/login";
    }

    model.addAttribute("email", user.getEmail());
    model.addAttribute("resortName", resortName);

    return "book_resort";
}

    @PostMapping("/book")
public String submitBooking(@RequestParam String username,
                            @RequestParam String email,
                            @RequestParam String resortName,
                            @RequestParam String roomType,
                            @RequestParam int numberOfGuests,
                            @RequestParam int numberOfRooms,
                            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date arrivalDate,
                            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date departureDate,
                            @RequestParam double totalPrice,
                            @RequestParam(required = false) String specialRequests,
                            Model model) {

    double roomPrice = switch (roomType) {
        case "Deluxe Room" -> 4500;
        case "Premium Cottage" -> 6200;
        case "Executive Suite" -> 9800;
        case "Family Villa" -> 12500;
        default -> 0;
    };

    Booking booking = new Booking.Builder()
            .username(username)
            .email(email)
            .resortName(resortName)
            .roomType(roomType)
            .numberOfGuests(numberOfGuests)
            .numberOfRooms(numberOfRooms)
            .arrivalDate(arrivalDate)
            .departureDate(departureDate)
            .roomPrice(roomPrice)
            .totalPrice(totalPrice)
            .specialRequests(specialRequests)
            .build();  // ✅ Builder in action

    bookingRepo.save(booking);
    return "redirect:/my_bookings?email=" + email;
}


}
