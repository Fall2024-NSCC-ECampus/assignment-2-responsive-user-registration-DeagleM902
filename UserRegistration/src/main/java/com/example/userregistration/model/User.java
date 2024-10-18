package com.example.userregistration.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Username of at least 4 characters, must be unique
    @NotEmpty(message = "Username is required")
    @Size(min = 4, message = "Username must be at least 4 characters long")
    @Column(unique = true)
    private String username;

    //Email annotation should require valid email
    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email is required")
    @Column(unique = true)
    private String email;

    //Password requirements can be modified, simple length is chosen here
    @NotEmpty(message = "Password is required")
    @Size(min = 4, message = "Password must be at least 4 characters long")
    private String password; //Store only hashed password

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
