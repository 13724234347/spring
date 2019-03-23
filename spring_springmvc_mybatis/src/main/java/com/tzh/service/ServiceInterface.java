package com.tzh.service;

import com.tzh.entity.User;

import java.util.List;

public interface ServiceInterface {

    List<User> query();

    void update();


}
