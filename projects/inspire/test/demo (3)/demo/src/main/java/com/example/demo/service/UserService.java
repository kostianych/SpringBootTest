package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser() {
        User user = new User( "user1", OffsetDateTime.now(ZoneOffset.UTC));
        //entityManager.persist(user);
        User savedUser = userRepository.save(user);

    }
}
