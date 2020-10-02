package com.example.demo.repo;

import com.example.demo.model.InvoiceDetails;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDetailsRepo extends JpaRepository<InvoiceDetails,Integer> {

    @Query("SELECT i from InvoiceDetails i WHERE i.invoiceid =:invoiceid")
    public List<InvoiceDetails> getDetailByInvoice(@Param("invoiceid") int invoiceid);

}
