package com.github.talmars.security;

import com.github.talmars.model.User;


public interface UserSecurityService {

    public User getUser(String login);
}
