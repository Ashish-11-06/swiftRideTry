package com.example.swiftRide.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
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
