<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/24
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //获取请求参数值
    String name = request.getParameter("name");
    String pwad = request.getParameter("pwad");

    //显示数据
    out.println("您的账号：" + name + "<p/>");
    out.println("你的密码：" + pwad);

    //保存数据
    session.setAttribute("name", name);
    session.setAttribute("pwad", pwad);

    response.sendRedirect("index.jsp");

%>
</body>
</html>
