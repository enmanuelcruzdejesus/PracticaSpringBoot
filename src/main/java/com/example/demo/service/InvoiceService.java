package com.example.demo.service;


import com.example.demo.model.Invoice;
import com.example.demo.repo.InvoiceRepo;
import com.example.demo.repo.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepo repo;

    public InvoiceService(){

    }

    public List<Invoice> fetchInvoices(){
        return  repo.findAll();
    }

    public Optional<Invoice> getInvoiceById(int id){
        return repo.findById(id);
    }

    public Invoice saveInvoice(Invoice value){
        return repo.save(value);
    }

    public void deleteInvoice(int id){
        this.repo.deleteById(id);
    }
}
