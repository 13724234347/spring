package com.tzh.dao;


import com.tzh.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoInterface extends JpaRepository<Role,Integer>{

}
