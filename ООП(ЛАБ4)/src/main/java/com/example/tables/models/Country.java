package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "country")
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private Collection<Tour> tours;
}
