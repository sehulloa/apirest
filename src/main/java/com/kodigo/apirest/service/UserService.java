package com.kodigo.apirest.service;

import com.kodigo.apirest.entity.User;

import java.util.List;

public interface UserService {

    User getUser(Long id);

    List<User> getAllUsers();

    User saveUser(User user);

    void deleteUser(Long id);
}
