
package com.example.resortmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resortmanagement.entity.User;
import com.example.resortmanagement.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        user.setRole("CUSTOMER");  // Set default role
        System.out.println("Registering user: ");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Role: " + user.getRole());
        return userRepository.save(user);  // Save user with name, email, password, and role
    }
    
    

    public User authenticate(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean emailExists(String email) {
        return userRepository.findByEmail(email) != null;
    }
    
}
