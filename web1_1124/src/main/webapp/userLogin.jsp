<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/24
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="javascript">
        document.location.href
    </script>

</head>
<body>
<%
    //删除属性
    session.removeAttribute("name");
    session.removeAttribute("pwad");
    //会话失效
    session.invalidate();


    out.println("<script>alert('已退出！');document.location.href = 'welcomewrite.jsp';</script> ");
%>
</body>
</html>
