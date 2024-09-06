package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
//@Data
public class Version {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVersion;

    @Column(nullable = false)
    private String version;

    @Column(nullable = false)
    private String versionDescription;

}
