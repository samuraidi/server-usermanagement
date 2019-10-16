package com.login.serverusermanagement.service;

import com.login.serverusermanagement.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
