<%--

--%>
<%@ page import="java.util.List" %>
<%@ page import="com.bo.entity.Game" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>主页</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
  <style type="text/css">
    h2, h3 {
      color: rgb(73, 73, 73);
    }
    #search {
      height: 80px;
      background-color: rgb(246, 246, 241);
      display: flex;
      align-items: center;
      padding-left: 8%;
      margin-bottom: 10px;
    }
    .search-input {
      flex: 0 0 40%;
      height: 35px;
      background-color: #ffffff;
      border: none;
      border-radius: 3px;
      margin-left: 50px;
    }
    .search-btn {
      width: 35px;
      height: 35px;
      background-color: rgb(155, 154, 143);
      display: flex;
      align-items: center;
      justify-content: center;
    }
    .search-btn img {
      width: 50%;
      height: 50%;
    }
    .card {
      height: 180px;
      margin: 20px 5px 20px 5px;
    }
    .card img {
      width: 100%;
      height: 90%;
    }
    .card p {
      font-size: 13px;
      color: #9b9b9b;
    }
    .col-4 img {
      margin: 10px 5px 20px 5px;
      width: 80%;
    }
    hr {
      width: 90%;
      color: #eee;
      margin-top: 10px;
    }
  </style>
</head>
<body>
<%
  List<Game> gameList = (List<Game>) application.getAttribute("gameList");
  pageContext.setAttribute("gameList", gameList);
%>
<div id="top">
  <jsp:include page="top.jsp"/>
</div>
<div id="search">
  <h2>游戏商店</h2>
  <input type="text" placeholder="游戏名、制作者、主办商" class="search-input">
  <div class="search-btn">
    <img src="images/search.png" alt="">
  </div>
</div>

<div class="container">
  <div class="row">
    <div class="col-8">
      <h3>关注游戏</h3>
      <hr>
      <div class="row">
        <%
          for (Game game : gameList) {
            pageContext.setAttribute("game", game);
        %>
        <div class="col-2 card">
          <a href="${pageContext.request.contextPath}/detail/${game.id}">
            <img src="images/${game.cover}" alt="">
          </a>
          <p style="color: rgb(51, 119, 178)">${game.name}</p>
          <p>${game.author}</p>
        </div>
        <%
          }
        %>
      </div>
    </div>
    <div class="col-4">
      <h3>热门游戏</h3>
      <hr>
      <img src="images/qqqq.png" alt="">
      <img src="images/qqq.png" alt="">
      <img src="images/qqq.png" alt="">
    </div>
  </div>

  <footer>
    <ul>
      <li>@2015-2019</li>
      <li>niit.edu.cn</li>
      <li>all rights reserved</li>
      <li>游戏人生</li>
    </ul>
    <ul>
      <li>联系我们</li>
      <li>帮助中心</li>
      <li>法律声明</li>
      <li>移动合作</li>
    </ul>
  </footer>
</div>
</body>
</html>