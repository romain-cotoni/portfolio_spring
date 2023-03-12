package com.project.portfolio_spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cv")
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cv")
    private Integer id;

    @Column(name = "fname_cv")
    private String firstname;

    @Column(name = "lname_cv")
    private String lastname;

    public Cv() {
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
