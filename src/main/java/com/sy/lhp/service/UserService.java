package com.sy.lhp.service;


import com.sy.lhp.model.User;

public interface UserService {
    public User findByUsername(String username) throws Exception;
}
