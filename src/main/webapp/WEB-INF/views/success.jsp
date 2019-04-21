<%@ page import="ssm.demo.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: cyan
  Date: 16/3/31
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginSuccess</title>
</head>
<body>
登录成功!
<%
    User user=(User)session.getAttribute("user");
%>
用户名:<%=user.getUsername()%><br>
个性签名:<%=user.getSlogan()%><br>
</body>
</html>