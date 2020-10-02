package com.example.demo.controller;

import com.example.demo.model.Invoice;
import com.example.demo.model.InvoiceDetails;
import com.example.demo.service.InvoiceDetailsService;
import com.example.demo.service.InvoiceService;
import com.example.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @Autowired
    private InvoiceDetailsService detailsService;

    @RequestMapping(path="invoice/getAll",method = RequestMethod.GET)
    public List<Invoice> getInvoices(){

        List<Invoice> Invoices = new ArrayList<Invoice>();

        Invoices = service.fetchInvoices();
        return Invoices;

    }


    @GetMapping("invoice/getById/{id}")
    public Invoice getInvoiceById(@PathVariable int id){
        return service.getInvoiceById(id).get();
    }

    @PostMapping("invoice/save")
    public  Invoice addInvoice (@RequestBody Invoice invoice){


//        List<InvoiceDetails> details = new ArrayList<>();
//        for(InvoiceDetails item : invoice.getItems()){
//            details.add(item);
//
//        }
//        var i = new Invoice(invoice.getCustomer(),details);
//        i.setOrderdate(invoice.getOrderdate());
//        i.setDateofdelivery(invoice.getDateofdelivery());


       return service.saveInvoice(invoice);


    }

}
