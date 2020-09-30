package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repo;

    public CustomerService(){

    }

    public List<Customer> fetchCustomers(){
        return  repo.findAll();
    }

    public Optional<Customer> getCustomerById(int id){
        return repo.findById(id);
    }

    public Customer saveCustomer(Customer value){
        return repo.save(value);
    }

    public void deleteCustomer(int id){
        this.repo.deleteById(id);
    }

}
