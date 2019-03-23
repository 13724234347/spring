package com.tzh.dao;

import com.tzh.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mapping {


    List<User> query();

    void update(User user);


}
