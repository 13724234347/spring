package com.tzh.controller;

import com.tzh.entity.Liucong;
import com.tzh.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ControllerClass {

    @Autowired
    private ServiceInterface serviceInterface;

    @RequestMapping(value = "/query")
    public  String query(){
       List<Liucong> list = serviceInterface.query();

        for (Liucong liucong:list
             ) {
            System.out.println(liucong);

        }

        return "index";
    }

    /*
  测试事务
  */
    @RequestMapping(value = "update")
    public String update() {
        serviceInterface.update();
        return "index";
    }



}
