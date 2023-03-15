package com.example.springbootproject_3_1_2.service;


import com.example.springbootproject_3_1_2.model.User;

import java.util.List;

public interface UserService {

    User getUserBiId(int id);

    void saveUser(User uer);

    void updateUser(User user);

    void removeUserBiId(int id);

    List<User> getAllUsers();
}
