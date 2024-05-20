package com.example.planviajes.entity;
import jakarta.persistence.*;
import lombok.Data;


@Data // Lombok annotation to create all the getters, setters, equals, hash, and toString methods based on the fields
@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
