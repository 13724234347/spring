package com.tzh.controller;

import com.tzh.entity.Role;
import com.tzh.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ControllerClass {


    @Autowired
    private ServiceInterface serviceInterface;

    @RequestMapping(value = "/query")
    public String query(Map map){
        System.out.println("111111111");
        List<Role> list = serviceInterface.query();

        for (Role role:list
             ) {
            System.out.println(role);
        }
        map.put("role",list);
        return "index";
    }
}
