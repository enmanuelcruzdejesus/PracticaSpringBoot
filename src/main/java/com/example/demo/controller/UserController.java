package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("users")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(path="/getAll",method = RequestMethod.GET)
    public List<User> fetchProductList(){

        List<User> Users = new ArrayList<User>();

        Users = service.fetchUsers();
        return Users;

    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable int id){
        return service.getUserById(id).get();
    }

    @PostMapping("/saveUser")
    public  User addUser (@RequestBody User User){
        return  service.saveUser(User);
    }



}
