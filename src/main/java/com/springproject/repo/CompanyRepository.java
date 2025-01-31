package com.springproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
