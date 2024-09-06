package com.example.demo.repository;

import com.example.demo.model.VersionCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionCompanyRepository extends JpaRepository<VersionCompany, Long> {


}
