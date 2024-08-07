package com.nisum.users.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long userId;
    private String first_name;
    private String last_name;
    private int age;
    private String phnno;
}
