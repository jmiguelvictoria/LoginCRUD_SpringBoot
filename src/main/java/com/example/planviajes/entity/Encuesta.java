package com.example.planviajes.entity;
import jakarta.persistence.*;
import lombok.Data;


@Data // Lombok annotation to create all the getters, setters, equals, hash, and toString methods based on the fields
@Entity
@Table(name = "form_responses")

public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String name;

    private String creator_user_id;
    private String country_of_residence;
    private String nationality;
    private String gender;
    private String companions;
    private Integer number_of_companions;
    private String reason_for_travel;
    private String travel_organization;
    private String package_services;

}
