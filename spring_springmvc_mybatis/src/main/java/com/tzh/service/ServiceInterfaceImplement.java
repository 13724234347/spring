package com.tzh.service;

import com.tzh.dao.Mapping;
import com.tzh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceInterfaceImplement implements ServiceInterface {
    @Autowired
    private Mapping mapping;


    @Override
    public List<User> query() {

        List<User> userList = mapping.query();

        return userList;
    }

    @Override
    public void update() {
        User user = new User();
        user.setId(1);
        user.setName("周业好");
        user.setAddr("阳江");
        user.setAge("19");
        user.setSex("男");
        mapping.update(user);

        int i = 1/0;

        User user1 = new User();
        user1.setId(1);
        user1.setName("班政");
        user1.setAddr("广西");
        user1.setAge("19");
        user1.setSex("男");
        mapping.update(user1);



    }
}
