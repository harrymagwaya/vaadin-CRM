package com.crm.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crm.crm.data.entity.Company;
import com.crm.crm.data.entity.Contact;
import com.crm.crm.data.entity.Status;
import com.crm.crm.data.repositories.CompanyRepository;
import com.crm.crm.data.repositories.ContactRepository;
import com.crm.crm.data.repositories.StatusRepository;

@Service
public class CrmService { // will have all apis to connect to db

    private final ContactRepository contactRepository;
    private final CompanyRepository companyRepository;
    private final StatusRepository statusRepository;

    public CrmService(ContactRepository contactRepository,
                      CompanyRepository companyRepository,
                      StatusRepository statusRepository  ){

            this.contactRepository = contactRepository;
            this.companyRepository = companyRepository;
            this.statusRepository = statusRepository;            
                        
    }

    // crud methods for contacts
    public List<Contact> findAllContacts(String filterText){
        if (filterText == null || filterText.isEmpty()) {
            return contactRepository.findAll();
        }
        else{
            return contactRepository.search(filterText);
        }
    }

    public long countContacts(){
        return contactRepository.count();
    }

    public void deleteContact(Contact contact){
        contactRepository.delete(contact);
    }

    public void saveContact(Contact contact){
        if (contact == null) {
            System.err.println("Contact is null");
            return;
        }
        contactRepository.save(contact);
    }


    public List<Company> findAllCompanies(){
        return companyRepository.findAll();
    }

    public List<Status> findAllStatuses(){
        return statusRepository.findAll();
    }

}
