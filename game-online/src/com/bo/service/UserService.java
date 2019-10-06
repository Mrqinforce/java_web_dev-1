package com.bo.service;


import com.bo.entity.User;
import com.bo.utils.Md5Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.bo.utils.Md5Util.*;

/**
 * @ClassName UserService
 * @Description TODO
 * @autor Mrqin
 *  * @Date 2019/10/5
 *  * @Version 1.0
 **/

public class UserService {
    private List<User> userList;

    public UserService() {
        init();
    }

    /**
     * 用户数据初始化方法
     * @return List<User>
     */
    public List<User> init() {
        userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "暗影", "user.jpg", "苏州市", LocalDate.of(2019, 1, 1)),
                new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "魔君", "user2.jpg", "中国", LocalDate.of(2019, 1, 1)),
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "舍我其谁", "user1.jpg", "潍坊市", LocalDate.of(2019, 1, 1))
            };
        userList = Arrays.asList(users);
        return userList;
    }

    /**
     * 用户登陆功能
     * @param account
     * @param password
     * @return user
     */
    public User signIn(String account, String password) {
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(crypt(password))) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        User user = new UserService().signIn("13951905171", crypt("111"));
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("登录失败");
        }
    }


}