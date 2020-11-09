package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.Impl.UserServiceImpl;
import com.qf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/addone")
public class AddOneController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        String sex = req.getParameter("sex");
        String email = req.getParameter("email");
        User user1 = new User(null,user, pass, sex, email);

        UserService userService = new UserServiceImpl();
        userService.add(user1);
        resp.sendRedirect("/selectAll");
    }
}
