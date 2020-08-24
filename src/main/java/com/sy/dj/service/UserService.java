package com.sy.dj.service;


import com.sy.dj.model.User;

public interface UserService {
    public User findByUsername(String username) throws Exception;
}
