package com.example.demo.model;

//Se usa jakarta para definir el identificador primario en la entidades del jpa
import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Data
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApp;

    @Column(unique = true, nullable = false)
    private String appCode;

    @Column(nullable = false)
    private String appName;

    @Column(nullable = false)
    private String appDescription;
}
