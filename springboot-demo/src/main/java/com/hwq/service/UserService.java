package com.hwq.service;

import java.util.List;

import com.hwq.entity.User;

public interface UserService {
    List<User> select();
    
    void insertInto(User user);
    
    void delete(User user);
}
