package com.tzh.service;


import com.tzh.dao.DaoInterface;
import com.tzh.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceInterfaceImplement implements ServiceInterface {

    @Autowired
    private DaoInterface daoInterface;


    @Override
    public List<Role> query() {
       List<Role> list =  daoInterface.findAll();
        System.out.println("22244");
        for (Role role:list
             ) {
            System.out.println(role);
        }
       return list;
    }
}
