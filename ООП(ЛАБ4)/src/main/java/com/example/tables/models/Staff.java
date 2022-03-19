package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "staff")
@AllArgsConstructor
@NoArgsConstructor
// Работник фирмы тур оператора
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fullName;
    private String passportNummer;
    private String address;
    //(FK)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Post position;

    @OneToOne(mappedBy = "staff")
    private TourTasks tourTasks;

    @OneToOne(mappedBy = "staff")
    private Order orders;

    public Staff(String fullName, String passportNummer, String address) {
        this.fullName = fullName;
        this.passportNummer = passportNummer;
        this.address = address;
    }

    public Staff(String fullName, String passportNummer, String address, Post position) {
        this.fullName = fullName;
        this.passportNummer = passportNummer;
        this.address = address;
        this.position = position;
    }

    public void setPost(Post post) {
        this.position=post;
    }
    public Post getPost(){
        return position;
    }
}
