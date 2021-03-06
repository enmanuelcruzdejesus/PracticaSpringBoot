package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class CustomerController {


    @GetMapping("/")
    public String index() {
        return "hello";
    }

    @Autowired
    private CustomerService service;

    @RequestMapping(path="customer/getAll",method = RequestMethod.GET)
    public List<Customer> getCustomers(){

        List<Customer> Customers = new ArrayList<Customer>();

        Customers = service.fetchCustomers();
        return Customers;

    }


    @GetMapping("customer/getById/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return service.getCustomerById(id).get();
    }

    @PostMapping("customer/save")
    public  Customer addCustomer (@RequestBody Customer Customer){
        return  service.saveCustomer(Customer);
    }



}
