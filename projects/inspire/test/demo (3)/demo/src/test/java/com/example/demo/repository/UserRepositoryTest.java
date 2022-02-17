package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


@SpringBootTest(classes = {UserRepository.class})
@EnableAutoConfiguration
@EntityScan("com.example.demo.entity")
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void testSave() {
        User user = new User( "user1", OffsetDateTime.of(2002, 3, 21, 8, 45, 14, 123, ZoneOffset.UTC));

        User savedUser = userRepository.save(user);

        User actualUser = userRepository.findById(savedUser.getId()).get();

        assertEquals(savedUser.getId(), actualUser.getId());
        assertEquals(savedUser.getName(), actualUser.getName());
        assertEquals("2003-03", actualUser.getCreateDate());
    }

}