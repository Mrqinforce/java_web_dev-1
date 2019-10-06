<%--

--%>
<%@ page import="com.bo.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User) session.getAttribute("user");
    pageContext.setAttribute("user", user);
%>
<ul>
    <li>
        <a href="${pageContext.request.contextPath}/index">首页</a>
    </li>
    <li>
        <a href="#">游戏</a>
    </li>
    <li>
        <a href="#">软件</a>
    </li>
    <li>
        <a href="#">硬件</a>
    </li>
    <li>
        <a href="#">新闻</a>
    </li>
    <li>
        <a href="#">排行榜</a>
    </li>
    <li>
        <a href="#">个人</a>
    </li>
    <li>
        <a href="#">更多</a>
    </li>
</ul>
<ul>

    <%
        if (user != null) {
    %>
    <li>
        <a href="${pageContext.request.contextPath}/user">
            <img src="${pageContext.request.contextPath}/images/${user.avatar}" alt="" class="avatar">
        </a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/logout">退出</a>
    </li>
    <%
    } else {
    %>
    <a href="${pageContext.request.contextPath}/login">去登录</a>
    <%
        }
    %>
</ul>