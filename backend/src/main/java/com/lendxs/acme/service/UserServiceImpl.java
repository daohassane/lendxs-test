package com.lendxs.acme.service;

import com.lendxs.acme.model.User;
import com.lendxs.acme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * This function save new user in DB
     * @param user
     * @return void
     */
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * This function get all users from DB
     *
     * @return List<User></>
     */
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
