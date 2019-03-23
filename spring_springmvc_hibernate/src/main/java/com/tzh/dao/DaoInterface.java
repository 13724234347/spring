package com.tzh.dao;

import com.tzh.entity.Liucong;

import java.util.List;

public interface DaoInterface {


    List<Liucong> query();

    void  update(Liucong liucong);

}
