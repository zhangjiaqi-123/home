package com.qf.controller;

import com.qf.service.Impl.UserServiceImpl;
import com.qf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/update")
public class UpdateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        UserService userService = new UserServiceImpl();
        Integer id = Integer.valueOf(req.getParameter("id"));
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        String sex = req.getParameter("sex");
        String email = req.getParameter("email");
        userService.update(user,pass,sex,email,id);
        resp.sendRedirect("/selectAll");


    }
}
