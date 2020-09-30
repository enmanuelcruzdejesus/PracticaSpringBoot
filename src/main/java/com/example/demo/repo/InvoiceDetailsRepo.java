package com.example.demo.repo;

import com.example.demo.model.InvoiceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDetailsRepo extends JpaRepository<InvoiceDetails,Integer> {
}
