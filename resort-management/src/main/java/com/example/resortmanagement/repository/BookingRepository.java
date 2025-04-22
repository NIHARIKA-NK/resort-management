package com.example.resortmanagement.repository;

import com.example.resortmanagement.model.Booking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByEmail(String email);

}
