package com.blankjee.service;

import com.blankjee.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
