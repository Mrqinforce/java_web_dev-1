package com.bo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LogoutServlet
 @Description 个人中心页面跳转控制
  * @autor Mrqin
 *  * @Date 2019/10/5
 *  * @Version 1.0
 **/
@WebServlet(urlPatterns = "/user")
public class UserPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }
}