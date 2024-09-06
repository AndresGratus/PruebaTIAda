package com.example.demo.serive;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepositor;


    public List<Company> getAllCompanies(){
        return companyRepositor.findAll();
    }

    public Optional<Company> getCompanyById(Long id){
        return companyRepositor.findById(id);
    }

    public Company getCompanyByName(String nameCompany){
        return companyRepositor.findByNameCompany(nameCompany);
    }

    // Método para obtener una lista sin datos repetidos
    public List<Company> getUniqueCompanies() {
        List<Company> companies = companyRepositor.findAll();
        return companies.stream()
                .distinct() // Elimina duplicados
                .collect(Collectors.toList());
    }

    public Company saveCompany(Company company){
        return companyRepositor.save(company);
    }

    public void deleteCompany(Long id){
        companyRepositor.deleteById(id);
    }
}
