package com.example.demo.controller;

import com.example.demo.model.Invoice;
import com.example.demo.model.InvoiceDetails;
import com.example.demo.service.InvoiceDetailsService;
import com.example.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InvoiceDetailsController {
    @Autowired
    private InvoiceDetailsService service;



    @RequestMapping(path="invoicedetails/getAll",method = RequestMethod.GET)
    public List<InvoiceDetails> getInvoiceDetais(){

        List<InvoiceDetails> details = new ArrayList<InvoiceDetails>();

        details  = service.fetchInvoiceDetailss();
        return details;

    }

    @RequestMapping(path="invoicedetails/getByInvoiceId/{id}",method = RequestMethod.GET)
    public List<InvoiceDetails> getDetailByInvoice(@PathVariable int id){

        List<InvoiceDetails> details  = service.getDetailByInvoice(id);
        return details;

    }


    @GetMapping("invoicedetails/getById/{id}")
    public InvoiceDetails getInvoiceById(@PathVariable int id){
        return service.getInvoiceDetailsById(id).get();
    }

    @PostMapping("invoicedetails/save")
    public  InvoiceDetails addInvoice (@RequestBody InvoiceDetails invoice){

        return service.saveInvoiceDetails(invoice);


    }



}
