package com.hwq.entity;

import java.io.Serializable;

/**
 * 
 * 用户实体类
 * @author jinnannan
 *
 */
public class User implements Serializable{

    private Integer id;//id

    private String name;//姓名

    private String address;//地址

    private Integer age;//年龄

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
