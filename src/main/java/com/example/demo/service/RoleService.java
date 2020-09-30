package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.repo.RoleRepo;
import com.example.demo.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepo repo;

    public RoleService(){

    }

    public List<Role> fetchRoles(){
        return  repo.findAll();
    }

    public Optional<Role> getRoleById(int id){
        return repo.findById(id);
    }

    public Role saveRole(Role r){
        return repo.save(r);
    }

    public void deleteRole(int id){
        this.repo.deleteById(id);
    }
}
