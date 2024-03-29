package com.example.swiftRide.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

    @NotNull(message = "Name cannot be null!")
    @NotBlank(message = "Name cannot be blank!")
    private String firstName;
    
    @NotNull(message = "Name cannot be null!")
    @NotBlank(message = "Name cannot be blank!")
    private String lastName;
    
    @NotNull(message="Mobile number cannot be null!")
    @NotBlank(message= "Mobile number cannot be blank!")
    @Pattern(regexp = "[6789]{1}[0-9]{9}", message = "Enter valid 10 digit mobile number")
    @Size(min = 10, max = 10)
    private String mobile;
    
    @Email
    private String email;
    
    @JsonIgnore
    @NotNull(message="Password cannot be null!")
    @NotBlank(message= "Password cannot be blank!")
    @Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Password must be 8-15 characters including alphanumerics and special characters")
    private String password;
    
    private Integer totalFeedBack = 0;
    private Integer totalReservation = 0;

//    @JsonIgnore
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Reservation> reservationList = new ArrayList<>();
//
//    @JsonIgnore
//    @OneToMany(mappedBy = "user")
//    private List<Feedback> feedbackList = new ArrayList<>();
}
