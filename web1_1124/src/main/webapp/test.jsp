<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/24
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    //获取请求参数值
    String name = request.getParameter("name");
    String uname = request.getParameter("uname");
    String pwad = request.getParameter("pwad");
    String te = request.getParameter("te");



    //显示数据
    out.println("以下是您的账 号，请核实！"+"<p/>");
    out.println("您的账号："+name+"<p/>");
    out.println("您的姓名："+uname+"<p/>");
    out.println("您的密码："+pwad+"<p/>");
    out.println("您的国家："+te+"<p/>");
    String[] hobby = request.getParameterValues("hobby");
    out.println("您的爱好：");
    if (hobby!=null) {
        for (String str : hobby) {
            out.println(str + " ");
        }
    }

%>

</body>
</html>
