package com.example.tables.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
@Data
@AllArgsConstructor
public class Post {
    @Id
    private String post;
    private int salary;
    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Staff> staffList;

    public Post(String post, int salary) {
        this.post = post;
        this.salary = salary;
        staffList = new ArrayList<Staff>();
    }
    public Post() {
    }

    public void addStaff(Staff staff) {
        staff.setPost(this);
        staffList.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }
}
