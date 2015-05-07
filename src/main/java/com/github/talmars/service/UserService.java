package com.github.talmars.service;

import com.github.talmars.dto.UserRegistrationDTO;
import com.github.talmars.model.User;


public interface UserService {

    User createUser(UserRegistrationDTO userRegistrationDTO);
    User getUserByLogin(String login);
}
