<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/25
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--实现网站计数器的功能，在网页中显示访问的人数统计--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //初始值
    Integer count = 0;
     //获得值
     Integer num =(Integer) application.getAttribute("count");

     if (num == null){
         count = 1;
     }else {
        count = Integer.valueOf(num);
         count++;
     }
    //设置值
    application.setAttribute("count",count);
%>
您好，您是第<%=application.getAttribute("count")%>位访问本网站的用户
</body>
</html>
