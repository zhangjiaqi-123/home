package com.qf.service.Impl;

import com.qf.dao.Impl.UserDaoImpl;
import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userdao = new UserDaoImpl();
    @Override
    public List<User> selectAll() {
        return userdao.selectAll();
    }

    @Override
    public User selectById(int id) {
        return userdao.selectById(id);
    }

    @Override
    public int update(String user, String pass, String sex, String email,Integer id) {
        return userdao.update(user,pass,sex,email,id);
    }

    @Override
    public int deleteOne(Integer id) {
        return userdao.deleteOne(id);
    }

    @Override
    public int add(User user) {
        return userdao.add(user);
    }
}
