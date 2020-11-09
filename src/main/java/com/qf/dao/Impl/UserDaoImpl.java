package com.qf.dao.Impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomi?characterEncoding=utf8","root","root");
            statement = connection.createStatement();
            String sql = "select u_id id,u_name name,u_pass pass,u_sex sex,u_email email from user where 1=1";
            resultSet = statement.executeQuery(sql);
            List list = new ArrayList();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setPass(resultSet.getString("pass"));
                user.setSex(resultSet.getString("sex"));
                user.setEmail(resultSet.getString("email"));
                list.add(user);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return null;
    }

    @Override
    public User selectById(int id) {

        Connection connection = null;
        Statement statement=null;
        ResultSet resultSet = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomi?characterEncoding=utf8","root","root");
            statement = connection.createStatement();
            String sql = "select u_id id, u_name name,u_pass pass,u_sex sex,u_email email from user where u_id="+id;
            resultSet = statement.executeQuery(sql);
            User user = new User();
            while (resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setPass(resultSet.getString("pass"));
                user.setSex(resultSet.getString("sex"));
                user.setEmail(resultSet.getString("email"));
            }
            return user;

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int update(String user, String pass, String sex, String email,Integer id) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomi?characterEncoding=utf8","root","root");

            String sql = "update user set u_name=?,u_pass=?,u_sex=?,u_email=? where u_id=?";
            ps = connection.prepareStatement(sql);
            ps.setObject(1,user);
            ps.setObject(2,pass);
            ps.setObject(3,sex);
            ps.setObject(4,email);
            ps.setObject(5,id);
            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int deleteOne(Integer id) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomi?characterEncoding=utf8","root","root");

            String sql = "delete from user where u_id=?";
            ps = connection.prepareStatement(sql);
            ps.setObject(1,id);
            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int add(User user) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomi?characterEncoding=utf8","root","root");

            String sql = "insert into user values (null,?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setObject(1,user.getName());
            ps.setObject(2,user.getPass());
            ps.setObject(3,user.getSex());
            ps.setObject(4,user.getEmail());
            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
