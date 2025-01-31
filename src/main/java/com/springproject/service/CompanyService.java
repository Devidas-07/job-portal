package com.springproject.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.entity.Company;
import com.springproject.repo.CompanyRepository;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company updateCompany(Long id, Company company) {
        company.setId(id);
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
