package com.hwq.controller;

import com.hwq.entity.User;
import com.hwq.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/query")
    @ResponseBody
    public List<User> toselect(){
        return userService.select();
    }
    
    @PostMapping(value="/user/add" )
    public String insertInto(User user){
    	userService.insertInto(user);
		return "success";
    }
    
    @RequestMapping(value="/user/delete")
    public String delete(User user) {
    	userService.delete(user);
		return "success";
	}
}
