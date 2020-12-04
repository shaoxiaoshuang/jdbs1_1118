<%@ page import="org.sxs.Cards" %>
<%@ page import="CardBiz" %><%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/27
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //1.中文处理
    request.setCharacterEncoding("utf-8");

    //2.获取参数值
    String card = request.getParameter("telephone");
    String pwd = request.getParameter("pas");

    //3.封装
    Cards cards = new Cards(card,pwd);

    //4.业务
    CardBiz biz = new CardBiz();

    //5.调用方法
    int count = biz.isLogin(cards);

    System.out.println("count =" +count);
    //判断
    if (count > 0) {
        response.sendRedirect("sd.jsp");
    } else {
        response.sendRedirect("zc.html");
    }
%>
</body>
</html>
