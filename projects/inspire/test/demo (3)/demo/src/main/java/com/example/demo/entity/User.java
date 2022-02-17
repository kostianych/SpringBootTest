package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name="my_user")
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    Long id;

    String name;

    OffsetDateTime createDate;

    public User() {}

    public User(String name, OffsetDateTime createDate) {
        this.name = name;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public OffsetDateTime getCreateDate() {
        return createDate;
    }
}
