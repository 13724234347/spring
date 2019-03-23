package com.tzh.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {

    private Integer id;

    private String role;

    private String roleIntroduce;

    private String roleState;


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", roleIntroduce='" + roleIntroduce + '\'' +
                ", roleState='" + roleState + '\'' +
                '}';
    }

    @Id
    @GeneratedValue//生成一个唯一标识的主键，可以用于主键生成策略
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleIntroduce() {
        return roleIntroduce;
    }

    public void setRoleIntroduce(String roleIntroduce) {
        this.roleIntroduce = roleIntroduce;
    }

    public String getRoleState() {
        return roleState;
    }

    public void setRoleState(String roleState) {
        this.roleState = roleState;
    }
}
