package com.lendxs.acme.controller;

import com.lendxs.acme.model.User;
import com.lendxs.acme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * This function create new user
     * @param user
     * @return String
     */
    @PostMapping("new")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "New user is added";
    }

    /**
     * This function return list of users
     *
     * @return List<User></>
     */
    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
