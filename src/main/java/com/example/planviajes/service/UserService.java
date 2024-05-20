package com.example.planviajes.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.planviajes.entity.User;
import com.example.planviajes.repository.UserRepository;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id){
        return userRepository.findById(id);
    }

    public void saveOrUpdate(User user){

        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
        String password = user.getPassword();
        user.setPassword(bcrypt.encode(password));

        userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public Optional<User> loginUser(String email, String password) {

        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();

        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userRepository.findByEmail(email).orElse(null);
            if (user != null && bcrypt.matches(password, user.getPassword())) {
                return userOptional;
            }
        }
        return Optional.empty();
    }


}


