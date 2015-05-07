package com.github.talmars.security.impl;

import com.github.talmars.model.User;
import com.github.talmars.security.UserSecurityService;
import com.github.talmars.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserSecurityServiceImpl implements UserSecurityService {

    @Autowired
    private UserService userService;

    @Override
    public User getUser(String login) {
        return userService.getUserByLogin(login);
    }
}
