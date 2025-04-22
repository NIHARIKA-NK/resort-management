package com.example.resortmanagement.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String resortName;
    private String roomType;
    private int numberOfGuests;
    private int numberOfRooms;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date arrivalDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date departureDate;

    private double roomPrice;
    private double totalPrice;

    @Column(length = 1000)
    private String specialRequests;

    // No-arg constructor (required by JPA)
    public Booking() {}

    // Private constructor for builder
    private Booking(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.resortName = builder.resortName;
        this.roomType = builder.roomType;
        this.numberOfGuests = builder.numberOfGuests;
        this.numberOfRooms = builder.numberOfRooms;
        this.arrivalDate = builder.arrivalDate;
        this.departureDate = builder.departureDate;
        this.roomPrice = builder.roomPrice;
        this.totalPrice = builder.totalPrice;
        this.specialRequests = builder.specialRequests;
    }

    // Builder class
    public static class Builder {
        private String username;
        private String email;
        private String resortName;
        private String roomType;
        private int numberOfGuests;
        private int numberOfRooms;
        private Date arrivalDate;
        private Date departureDate;
        private double roomPrice;
        private double totalPrice;
        private String specialRequests;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder resortName(String resortName) {
            this.resortName = resortName;
            return this;
        }

        public Builder roomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder numberOfGuests(int numberOfGuests) {
            this.numberOfGuests = numberOfGuests;
            return this;
        }

        public Builder numberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public Builder arrivalDate(Date arrivalDate) {
            this.arrivalDate = arrivalDate;
            return this;
        }

        public Builder departureDate(Date departureDate) {
            this.departureDate = departureDate;
            return this;
        }

        public Builder roomPrice(double roomPrice) {
            this.roomPrice = roomPrice;
            return this;
        }

        public Builder totalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder specialRequests(String specialRequests) {
            this.specialRequests = specialRequests;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }
}
