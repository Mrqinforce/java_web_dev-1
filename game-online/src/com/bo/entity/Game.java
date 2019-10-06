package com.bo.entity;

/**
 * @ClassName Game
 * @Description TODO
 * @autor Mrqin
 * @Date 2019/10/5
 * @Version 1.0
 **/

    public class Game {
        private Integer id;
        private String name;
        private String cover;
        private String author;

        public Game(Integer id, String name, String cover, String author) {
            this.id = id;
            this.name = name;
            this.cover = cover;
            this.author = author;
        }

        public Game() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }


        @Override
        public String toString() {
            return "Game{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", cover='" + cover + '\'' +
                    '}';
        }
    }

