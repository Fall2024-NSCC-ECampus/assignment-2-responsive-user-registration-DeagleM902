package com.example.userregistration.service;

import com.example.userregistration.model.User;
import com.example.userregistration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public void registerUser(User user){
        //Check if email is in use
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("Email address already in use");
        }
        //Check if username is in use
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new IllegalArgumentException("Username already in use");
        }

        //Hash password, save user
        user.setPassword(encoder.encode(user.getPlainPassword()));
        userRepository.save(user);
    }
}
