package com.tzh.dao;

import com.tzh.entity.Liucong;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class DaoInterfaceImplement implements DaoInterface{

    @Resource
    private SessionFactory sessionFactory;


    @Override
    public List<Liucong> query() {
        Session session=sessionFactory.getCurrentSession();

        List<Liucong> list = session.createQuery("from Liucong ").getResultList();

        return list;
    }

    @Override
    public void update(Liucong liucong) {
        Session session=sessionFactory.getCurrentSession();
        Liucong oldLiucong = session.get(Liucong.class,1);
        oldLiucong.setName(liucong.getName());
        oldLiucong.setAddr(liucong.getAddr());
        oldLiucong.setSex(liucong.getSex());
        oldLiucong.setAge(liucong.getAge());
        session.save(oldLiucong);
    }
}
