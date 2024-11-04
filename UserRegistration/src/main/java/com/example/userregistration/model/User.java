package com.example.userregistration.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Username of at least 4 characters, must be unique, simple regex
    @NotEmpty(message = "Username is required")
    @Size(min = 4, max = 30, message = "Username must be between 4 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z0-9_-]{4,30}$", message = "Username must contain only letters, numbers, underscores or hyphens.")
    @Column(unique = true)
    private String username;

    //Email annotation should require valid email
    //@Email annotation should be sufficient, no regex required at this moment
    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email is required")
    @Column(unique = true)
    private String email;

    //Transient ensures the password can be validated, but it is not stored before hashing
    //This may not be the correct way
    @NotEmpty(message = "Password is required")
    @Size(min = 4, max = 30, message = "Password must be between 4 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z0-9_-]{4,30}$", message = "Password must contain only letters, numbers, underscores or hyphens.")
    @Transient
    private String plainPassword;

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

    public String getPlainPassword() {return plainPassword;}

    public void setPlainPassword(String plainPassword) {this.plainPassword = plainPassword;}
}
