package com.example.Real.estate.Model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Mediator {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int mobile;

    @OneToMany(mappedBy = "mediator")
    @JsonIgnore
   private List<Realestate> items = new ArrayList<>();


    public Mediator(int id, String name, String email, int mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public Mediator() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public List<Realestate> getItems() {
        return items;
    }

    public void setItems(List<Realestate> items) {
        this.items = items;
    }

    //    @Override
//    public String toString() {
//        return "Mediator{" +
//                "id=" + id +
//                ", Name='" + Name + '\'' +
//                ", email='" + email + '\'' +
//                ", mobile=" + mobile +
//
//                '}';
//    }
}
