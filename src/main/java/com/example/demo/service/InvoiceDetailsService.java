package com.example.demo.service;

import com.example.demo.model.InvoiceDetails;
import com.example.demo.repo.InvoiceDetailsRepo;
import com.example.demo.repo.InvoiceDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceDetailsService {
    @Autowired
    private InvoiceDetailsRepo repo;

    public InvoiceDetailsService(){

    }

    public List<InvoiceDetails> fetchInvoiceDetailss(){
        return  repo.findAll();
    }

    public Optional<InvoiceDetails> getInvoiceDetailsById(int id){
        return repo.findById(id);
    }

    public InvoiceDetails saveInvoiceDetails(InvoiceDetails value){
        return repo.save(value);
    }

    public void deleteInvoiceDetails(int id){
        this.repo.deleteById(id);
    }
}
