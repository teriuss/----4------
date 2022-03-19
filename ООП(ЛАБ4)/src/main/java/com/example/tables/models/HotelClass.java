package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotel_class")
@AllArgsConstructor
@NoArgsConstructor
@Data
// Класс обслуживания в номере
public class HotelClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;
    @Column(name = "hotel_class")
    private String hotel_class;
    @OneToMany(mappedBy = "hotelClass")
    private List<Hotel> hotelList;
}
