package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController("product")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ProductController {
    @Autowired
    private ProductService service;

    @RequestMapping(path="product/getAll",method = RequestMethod.GET)
    public List<Product> getProducts(){

        List<Product> Products = new ArrayList<Product>();

        Products = service.fetchProducts();
        return Products;

    }


    @GetMapping("product/getById/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id).get();
    }

    @PostMapping("product/save")
    public  Product addProduct (@RequestBody Product Product){
        return  service.saveProduct(Product);
    }

}
