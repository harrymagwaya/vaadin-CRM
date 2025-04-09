package com.crm.crm.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.data.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    
} 
