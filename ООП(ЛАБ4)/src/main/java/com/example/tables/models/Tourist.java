package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tourist{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;
    @Column(name = "tourist_passport_number")
    private long touristPassportNumber;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "tourist_age")
    private int touristAge;
    @Column(name = "address")
    private String address;
    @OneToOne(mappedBy = "tourist")
    private TravelPackage travelPackage;
}
