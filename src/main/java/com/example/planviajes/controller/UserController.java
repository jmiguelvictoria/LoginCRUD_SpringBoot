package com.example.planviajes.controller;

import java.util.HashMap;
import java.util.List; // Import the correct List class
import java.util.Optional;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.planviajes.entity.User;
import com.example.planviajes.service.UserService;

@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService; 

    @GetMapping
    public List<User> getAll(){

        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public Optional<User> getBId(@PathVariable Long userId){

        return userService.getUser(userId);
    }

    @PostMapping
    public User saveOrUpdate(@RequestBody User user){

        userService.saveOrUpdate(user);
        return user;
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable Long userId){

        userService.delete(userId);
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody User user) {
        Optional<User> userOptional = userService.loginUser(user.getEmail(), user.getPassword());
        if (userOptional.isPresent()) {
            return ResponseEntity.ok().body(userOptional.get());
        } else {

            Map<String, String> response = new HashMap<>();
            response.put("error", "Invalid email or password para BDENCUESTA");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);        }
    }


}
