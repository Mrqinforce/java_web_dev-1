package com.bo.servlet;

import com.bo.entity.Game;
import com.bo.entity.Game;

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
 * @ClassName GameDetailController
 * @Description 游戏详情页面
 * @Date 2019/10/5
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/detail/*")
public class GameDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestPath = req.getRequestURI().trim();
        int position = requestPath.lastIndexOf("/");
        String id = requestPath.substring(position + 1);
        ServletContext sc = this.getServletContext();
        List<Game> gameList = (List<Game>) sc.getAttribute("gameList");
        for (Game game : gameList) {
            if (Integer.parseInt(id) == game.getId()) {
                req.setAttribute("game", game);
                req.getRequestDispatcher("/game_detail.jsp").forward(req, resp);
            }
        }
    }
}