<%--
  Created by IntelliJ IDEA.
  User: DXnima
  Date: 2019/4/23
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.dx21601.pojo.Student" %><%--
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
    Student user=(Student) session.getAttribute("user");
%>
用户名:<%=user.getsSid()%><br>
姓名:<%=user.getsName()%><br>
</body>
</html>
