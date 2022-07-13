package com.lendxs.acme.service;

import com.lendxs.acme.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
