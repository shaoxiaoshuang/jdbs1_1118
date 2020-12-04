<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/24
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            border: solid;
            border-width: 2px;
        }
    </style>
</head>
<body>
<table>
    <%
        for (int i = 1; i < 10; i++) { out.print("<tr>");
            for (int j = 1; j <= i; j++) {
                int count = i * j;
                out.print("<td>" + i + "*" + j + "=" + count + "</td>");
            }out.println("</tr>");
        }
    %>

    <%--<%int m=0; %>--%>
    <%--<%int n=0; %>--%>
    <%--<%for (m=1;m<10;m++ ){%>--%>
    <%--<%for (n=1;n<=m;n++) {%>--%>
    <%--<%String s=m+"*"+n+"="+(m*n)+"&nbsp &nbsp"; %>--%>
    <%--<%=s %>--%>
    <%--<%  } %>--%>
    <%--<%String nr="<br>"; %>--%>
    <%--<%=nr %>--%>
    <%--<%} %>--%>
</table>
</body>
</html>
