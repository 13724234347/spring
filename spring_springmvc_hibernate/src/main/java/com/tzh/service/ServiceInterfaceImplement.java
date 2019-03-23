package com.tzh.service;

import com.tzh.dao.DaoInterface;
import com.tzh.entity.Liucong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class ServiceInterfaceImplement implements ServiceInterface{

    @Autowired
    private DaoInterface daoInterface;

    @Override
    @Transactional
    public List<Liucong> query() {

        List<Liucong> list = daoInterface.query();

        return list;
    }

    @Override
    @Transactional
    public void update() {
        Liucong liucong = new Liucong();
        liucong.setName("liucong");
        liucong.setAge(20);
        liucong.setSex("男");
        liucong.setAddr("衡阳");

        daoInterface.update(liucong);
        int i = 1/0;
        Liucong zouxiangyun = new Liucong();
        liucong.setName("zouxiangyun");
        liucong.setAge(19);
        liucong.setSex("女");
        liucong.setAddr("衡阳");
        daoInterface.update(zouxiangyun);



    }
}
