<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/24
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    欢迎<br/>
    <%=session.getAttribute("name")%><br/>
    <%=session.getAttribute("pwad")%>
</h1>

     <a href="userLogin.jsp">注销</a>
</body>
</html>
