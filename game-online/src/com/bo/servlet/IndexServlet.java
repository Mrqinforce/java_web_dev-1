package com.bo.servlet;

import com.bo.entity.Game;
import com.bo.service.GameService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Mrqin
 * @ClassName IndexController
 * @Description 拦截/index请求，获取所有游戏数据，并通过服务器端转发跳转到主页
 * @Date 2019/10/5
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用BookService的init方法，产生图书数据集合
        List<Game> gameList = GameService.init();
        //获得各个Servlet共享的对象
        ServletContext sc = this.getServletContext();
        sc.setAttribute("bookList", gameList);
        //通过服务器端转发，将数据带过去，并保持地址栏不变
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}