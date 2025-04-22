// package com.example.resortmanagement.model;

// import jakarta.persistence.*;
// import java.util.ArrayList;
// import java.util.List;

// @Entity
// public class Resort {

//     @Id
//     @Column(name = "resort_id")
//     private Long resortId;

//     private String name;
//     private String location;
//     private String description;

//     @OneToMany(mappedBy = "resort", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//     private List<Facility> facilities = new ArrayList<>();

//     // Getters and setters

//     public Long getResortId() {
//         return resortId;
//     }

//     public void setResortId(Long resortId) {
//         this.resortId = resortId;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getLocation() {
//         return location;
//     }

//     public void setLocation(String location) {
//         this.location = location;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }

//     public List<Facility> getFacilities() {
//         return facilities;
//     }

//     public void setFacilities(List<Facility> facilities) {
//         this.facilities = facilities;
//     }
// }

package com.example.resortmanagement.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Resort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resort_id")
    private Long resortId;


    private String name;
    private String location;
    private String description;

    @Column(name = "longdescription", columnDefinition = "TEXT")
    private String longdescription;

    @OneToMany(mappedBy = "resort", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Facility> facilities = new ArrayList<>();

    // Getters and setters

    public Long getResortId() {
        return resortId;
    }

    public void setResortId(Long resortId) {
        this.resortId = resortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongdescription() {
        return longdescription;
    }

    public void setLongdescription(String longdescription) {
        this.longdescription = longdescription;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }
}
