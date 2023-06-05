package com.plaza.spring.springboot.plazashop.service;

import com.plaza.spring.springboot.plazashop.entities.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByLogin(String login);


    User saveUser(User user);
}
