


package com.bo.listener;

import com.bo.entity.Game;
import com.bo.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ContextLoaderListener
 * @Description TODO
 * @autor Mrqin
 * @Date 2019/10/5
 * @Version 1.0
 **/

@WebListener
public class ContextLoaderListener implements ServletContextListener {

    /**
     * @Description 容器初始化方法
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("启动");
        //创建并生成用户数据列表
        List<User> userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "暗影", "user.jpg", "苏州市", LocalDate.of(2019, 1, 1)),
                new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "魔君", "user2.jpg", "中国", LocalDate.of(2019, 1, 1)),
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "舍我其谁", "user1.jpg", "潍坊市", LocalDate.of(2019, 1, 1))
        };
        userList = Arrays.asList(users);

        //创建并生成图书数据列表
        List<Game> gameList = new ArrayList<>(10);
        Game[] games = new Game[]{
                new Game(1, "英雄联盟", "game1.jpg", "Giot Game"),
                new Game(2, "NBA2kOnline", "game2.jpg", "Jonathan Rivera"),
                new Game(3, "QQ飞车", "game4.jpg", "郑磊"),
                new Game(4, "NBA2k19", "game3.png", "Jonathan Rivera"),
                new Game(5, "逆战", "game5.jpg", "腾讯"),
                new Game(6, "反恐精英", "game6.jpg", "Unreal Software"),
                new Game(7, "Neon Tall", "game7.jpg", "Fei, Leo, Yang"),
                new Game(8, "Super Realistic", "game8.jpg", "Doonamai, LLC"),
                new Game(9, "Panzer Arena", "game9.jpg", "LODZERO"),
                new Game(10, "Blook Yeah", "game10.jpg", "Walking Talking Grilling Bear"),
                new Game(11, "篮球计划", "game11.jpg", "GIP 12"),
                new Game(12, "无奇刀", "game12.jpg", "Hangzhou Wookart Technology "),
                new Game(10, "War Blade", "game13.jpg", "Tvr Games"),
                new Game(11, "VR ROME", "game14.jpg", "Steven Luo"),
                new Game(12, "Al Dummy", "game15.jpg", "Narko Games")

        };
        gameList = Arrays.asList(games);

        //获得全局变量
        ServletContext servletContext = sce.getServletContext();
        //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
        servletContext.setAttribute("userList", userList);
        servletContext.setAttribute("gameList", gameList);
    }

    /**
     * 销毁方法
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}