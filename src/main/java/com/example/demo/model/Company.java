package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
//@Data //Esto nos ahorra mucho codigo ya que nos implementa los  getters, setters, toString y mas
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;

    @Column(unique = true, nullable = false)
    private String codigoCompany;

    @Column(nullable = false)
    private String nameCompany;

    @Column(nullable = false)
    private String descriptionCompany;


}
