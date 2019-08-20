package com.bob.aopspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserNameById(Integer id){
        System.out.println("deleteUserById");
        return "bob";
    }

    public void deleteUserById(Integer id){
        System.out.println("deleteUserById");
    }
}
