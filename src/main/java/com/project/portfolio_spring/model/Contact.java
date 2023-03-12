package com.project.portfolio_spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ctc")
    private Integer id;

    @Column(name = "fname_ctc")
    private String firstname;

    @Column(name = "lname_ctc")
    private String lastname;
}
