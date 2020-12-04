<%@ page import="org.sxs.Cards" %>
<%@ page import="CardBiz" %><%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/26
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    //1.中文处理
    request.setCharacterEncoding("utf-8");

    //2.获取参数值  String name, String card, String pwd
    String name = request.getParameter("name");
    String pwd = request.getParameter("pwd5555");
    String card = request.getParameter("card");

    //3.封装
    Cards cards = new Cards(name, card,pwd);

    //4.业务
    CardBiz biz = new CardBiz();

    //5.调用方法
    int count = biz.add(cards);

    //判断
    if (count > 0) {
        response.sendRedirect("dl.html");
    } else {
        response.sendRedirect("zc.html");
    }
%>
