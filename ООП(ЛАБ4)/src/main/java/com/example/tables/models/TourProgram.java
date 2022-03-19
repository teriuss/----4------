package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tour_program")
@AllArgsConstructor
@NoArgsConstructor
// Перечеть основных мероприятий тура
public class TourProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private int id;
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @OneToMany(mappedBy = "programNumber", fetch = FetchType.EAGER)
    private int  programmNumber;
    @Column(name = "description")
    private String description;
}
