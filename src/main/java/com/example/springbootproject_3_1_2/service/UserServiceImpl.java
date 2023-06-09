package com.example.springbootproject_3_1_2.service;

import com.example.springbootproject_3_1_2.dao.Dao;
import com.example.springbootproject_3_1_2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    Dao userDAO;
    @Autowired
    public UserServiceImpl(Dao userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserBiId(int id) {
        return userDAO.getUserBiId(id);
    }
    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }
    @Override
    @Transactional
    public void removeUserBiId(int id) {
        userDAO.removeUserBiId(id);
    }
    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
