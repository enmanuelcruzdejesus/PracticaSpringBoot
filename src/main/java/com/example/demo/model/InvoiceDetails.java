package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "InvoiceDetails")
public class InvoiceDetails {



    public InvoiceDetails(){


    }
    public InvoiceDetails(Invoice invoice) {
        this.invoice = invoice;
        this.invoiceid = invoice.getId();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private int invoiceid;
    private int productid;
    private int quantity;




    private double unitprice;
    private int value;



    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;



    @ManyToOne(  fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;





}
