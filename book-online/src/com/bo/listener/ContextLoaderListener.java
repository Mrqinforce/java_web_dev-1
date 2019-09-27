


package com.bo.listener;

import com.bo.entity.Book;
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
 * @autor dq_ge
 * @Date 2019/9/28
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
        System.out.println("容器启动");
        //创建并生成用户数据列表
        List<User> userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "杀手", "user4.jpeg", "江苏南京", LocalDate.of(2018, 6, 11)),
                new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "发噶", "user2.jpeg", "浙江杭州", LocalDate.of(2019, 2, 18)),
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "Agassiz", "user1.jpg", "湖北武汉", LocalDate.of(2019, 8, 19))
        };
        userList = Arrays.asList(users);

        //创建并生成图书数据列表
        List<Book> bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1, "漫长的婚约", "1.jpg", "发发发"),
                new Book(2, "庸人自扰", "2.jpg", "打发士大夫"),
                new Book(3, "绿山墙的安妮", "3.jpg", "烦烦烦"),
                new Book(4, "敌人与邻居", "4.jpg", "方法是否是"),
                new Book(5, "哀伤纪", "5.png", "导弹发射的"),
                new Book(6, "漫长的婚约", "7.jpeg", "三国杀"),
                new Book(7, "庸人自扰", "8.jpeg", "政府在双方"),
                new Book(8, "绿山墙的安妮", "9.jpg", "是股市大幅"),
                new Book(9, "敌人与邻居", "10.jpg", "士大夫十分"),
                new Book(10, "哀伤纪", "11.jpg", "伤感的故事"),
                new Book(11, "漫长的婚约", "6.jpeg", "大师傅士大夫"),
                new Book(12, "庸人自扰", "14.jpg", "打发士大夫")

        };
        bookList = Arrays.asList(books);

        //获得全局变量
        ServletContext servletContext = sce.getServletContext();
        //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
        servletContext.setAttribute("userList", userList);
        servletContext.setAttribute("bookList", bookList);
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