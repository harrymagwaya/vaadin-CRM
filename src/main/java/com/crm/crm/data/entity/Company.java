package com.crm.crm.data.entity;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.annotations.Formula;

import com.vaadin.flow.component.template.Id;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Company  {

    @NotBlank
    private String name;

    @OneToMany(mappedBy = "company")
    @Nullable
    private List<Contact> employees = new LinkedList<>();

    @Formula("(select count(c.id) from Contact c where c.company_id = id)")
    private int employeeCount;

    public int getEmployeeCount(){
        return employeeCount;
    }

    public String getName(){ return name;};

    public void setName(String name){ this.name  = name;}

    public List<Contact> getEmployee(){ return employees;};

    public void setEmployee(List<Contact> employee){ this.employees = employee;};
}
