package com.midas2018.root.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.midas2018.root.model.User;
import com.midas2018.root.model.UserStatus;
import com.midas2018.root.model.UserVO;

@Repository
public class UserRepository {
    @Autowired
    private UserMapper userMapper;

    public User findUserByEmail(String email) {
        return userMapper.findUserByEmail(email);
    }

    public void signup(UserVO user) {
        userMapper.signup(user);
    }

    public UserVO selectUserByEmail(String email) {
        return userMapper.selectUserByEmail(email);
    }

    public UserStatus selectUserStatusByUserId(int userId) {
        return userMapper.selectUserStatusByUserId(userId);
    }

    public UserVO signin(String email, String password) {
        return userMapper.signin(email, password);
    }
}
