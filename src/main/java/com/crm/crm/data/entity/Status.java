package com.crm.crm.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Status {
    private String name;

    public Status(){
        
    }

    public Status(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    } 

    public void setName(String name){
        this.name = name;
    }
}
