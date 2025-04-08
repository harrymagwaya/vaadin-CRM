package com.crm.crm.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.data.entity.Status;

public interface StatusRepository extends JpaRepository<Status , Integer> {
    
}
