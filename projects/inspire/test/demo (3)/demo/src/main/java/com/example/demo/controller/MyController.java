package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Controller
public class MyController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String saveUser() {
        userRepository.save(new User("user1", OffsetDateTime.now(ZoneOffset.UTC)));
        return "Saved!";
    }


}
