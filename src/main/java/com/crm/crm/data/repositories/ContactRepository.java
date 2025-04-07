package com.crm.crm.data.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.data.entity.Contact;
 
public interface ContactRepository  extends JpaRepository<Contact,Integer>{

    
} 
