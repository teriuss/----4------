package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room_category")
@AllArgsConstructor
@NoArgsConstructor
@Data
// Класс обслуживания в номере
public class RoomCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;
    @Column(name = "category")
    private String roomCategory;
    @OneToMany(mappedBy = "roomCategory")
    private List<HotelRooms> hotelList;
}
