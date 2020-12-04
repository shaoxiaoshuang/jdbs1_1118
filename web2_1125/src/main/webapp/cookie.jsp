<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/25
  Time: 14:27
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
    String uname = request.getParameter("uname");
    String upass = request.getParameter("upass");

    //显示数据
    out.println("您的用户名是" + uname + "<p/>");
    out.println("您的密码是" + upass);

    //保存数据
    //创建cookie对象
    Cookie cookie = new Cookie("uname", uname);
    Cookie cookie2 = new Cookie("upass", upass);

    //添加
    response.addCookie(cookie);
    response.addCookie(cookie2);

    //  生命周期
    cookie.setMaxAge(5 * 60);

    //跳转
    response.sendRedirect("show.jsp");
%>
</body>
</html>
