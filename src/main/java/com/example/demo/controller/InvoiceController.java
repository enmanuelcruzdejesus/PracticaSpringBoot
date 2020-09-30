package com.example.demo.controller;

import com.example.demo.model.Invoice;
import com.example.demo.service.InvoiceService;
import com.example.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("invoice")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @RequestMapping(path="/getAll",method = RequestMethod.GET)
    public List<Invoice> fetchProductList(){

        List<Invoice> Invoices = new ArrayList<Invoice>();

        Invoices = service.fetchInvoices();
        return Invoices;

    }


    @GetMapping("/getInvoiceById/{id}")
    public Invoice getInvoiceById(@PathVariable int id){
        return service.getInvoiceById(id).get();
    }

    @PostMapping("/saveInvoice")
    public  Invoice addInvoice (@RequestBody Invoice Invoice){
        return  service.saveInvoice(Invoice);
    }

}
