package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Data
public class VersionCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVersionCompany;

    @Column(nullable = false)
    private Long idVersion;

    @Column(nullable = false)
    private Long idCompany;

    @Column(nullable = false)
    private String versionCompanyDescription;
}
