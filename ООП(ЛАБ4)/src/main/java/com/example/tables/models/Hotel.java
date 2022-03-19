package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotel")
@Data@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="city", columnDefinition = "varchar(20)")
    private String city;
    @Column(name="name", columnDefinition = "varchar(20)")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_class")
    private HotelClass hotelClass;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_id")
    private Tour tour;




}
