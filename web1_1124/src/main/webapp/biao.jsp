<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/24
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            border: solid ;
            border-width: 2px;
            background-color: aquamarine;
        }
    </style>
</head>
<body>
<table>
    <%
        for (int i = 1; i < 11; i++) { out.print("<tr>");
            for (int j = 1; j < 11; j++) {
                out.print("<td>第" + i + "行第" + j + "列</td>");
            }out.println("</tr>");
        }
    %>
</table>
</body>
</html>
