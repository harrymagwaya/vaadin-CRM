package com.crm.crm.data.entity;

import java.util.LinkedList;
import java.util.List;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Company extends AbstractEntity {
    @NotBlank
    private String name;

    @OneToMany(mappedBy = "company")
    @Nullable
    private List<Contact> employees = new LinkedList<>();

    public String getName(){ return name;};

    public void setName(String name){ this.name  = name;}

    public List<Contact> getEmployee(){ return employees;};

    public void setEmployee(List<Contact> employee){ this.employees = employee;};
}
