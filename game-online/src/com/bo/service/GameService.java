package com.bo.service;

import com.bo.entity.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @autor Mrqin
 *  * @Date 2019/10/5
 *  * @Version 1.0
 **/

public class GameService {

    public static List<Game> init() {
        List<Game> gameList = new ArrayList<>(10);
        Game[] games = {
                new Game(1, "英雄联盟", "game1.jpg", "Giot Game"),
                new Game(2, "NBA2konline", "game2.jpg", "Jonathan Rivera"),
                new Game(3, "QQ飞车", "game4.jpg", "郑磊"),
                new Game(4, "NBA2k19", "game3.png", "Jonathan Rivera"),
                new Game(5, "逆战", "game5.jpg", "腾讯"),
                new Game(6, "反恐精英", "game6.jpg", "Unreal Software"),
                new Game(7, "Neon Tall", "game7.jpg", "Fei, Leo, Yang"),
                new Game(8, "Super Realistic", "game8.jpg", "Doonamai, LLC"),
                new Game(9, "Panzer Arena", "game9.jpg", "LODZERO"),
                new Game(10, "Blook Yeah", "game10.jpg", "Walking Talking Grilling Bear"),
                new Game(11, "篮球计划", "game11.jpg", "GIP 12"),
                new Game(12, "无奇刀", "game12.jpg", "Hangzhou Wookart Technology Co.,Ltd."),
                new Game(10, "War Blade", "game13.jpg", "Tvr Games"),
                new Game(11, "VR EOME", "game14.jpg", "Steven Luo"),
                new Game(12, "Al Dummy", "game15.jpg", "Narko Games")



        };
        gameList = Arrays.asList(games);
        return gameList;
    }

    public static void main(String[] args) {
        List<Game> gameList = GameService.init();
        for (Game game : gameList) {
            System.out.println(game);
        }
    }
}