package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

// Задания для составителя туров
@Entity
@Data
@Table(name = "tour_tasks")
@AllArgsConstructor
@NoArgsConstructor
public class TourTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String definition;
    @Column(name = "executing_time", columnDefinition = "data")
    private Date executingTime;
    private String status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_id")
    private Tour tour;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id")
    private Staff staff;





}
