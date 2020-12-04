<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/25
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //取出cookie值
    Cookie[] cookies = request.getCookies();
    //遍历
    for (int i = 0; i <cookies.length ; i++) {
        //判断
        if (!cookies[i].getName().equals("JSESSIONID")) {
            out.print(cookies[i].getName() + ":" + cookies[i].getValue() + "<br/>");
        }
    }
%>
</body>
</html>
