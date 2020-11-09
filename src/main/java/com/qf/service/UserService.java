package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    User selectById(int id);

    int update(String user, String pass, String sex, String email,Integer id);

    int deleteOne(Integer id);

    int add(User user);
}
