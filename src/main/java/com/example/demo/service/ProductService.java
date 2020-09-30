package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public ProductService(){

    }

    public List<Product> fetchProducts(){
        return  repo.findAll();
    }

    public Optional<Product> getProductById(int id){
        return repo.findById(id);
    }

    public Product saveProduct(Product p){
        return repo.save(p);
    }

    public void deleteProduct(int id){
        this.repo.deleteById(id);
    }

}
