package com.tzh.controller;

import com.tzh.entity.User;
import com.tzh.service.ServiceInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ControllerClass {

    private static Logger logger = LogManager.getLogger();


    @Autowired
    private ServiceInterface serviceInterface;

    @RequestMapping(value = "/query")
    public String query() {
        List<User> userList = serviceInterface.query();
        for (User user :
                userList) {
            System.out.println(user);
        }
        logger.debug("进入debug日志打印");
        return "index";
    }

    /*
    测试aop事务
    */
    @RequestMapping(value = "update")
    public String update() {
        serviceInterface.update();
        return "index";
    }
}




