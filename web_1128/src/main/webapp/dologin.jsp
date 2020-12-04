<%@ page import="org.sxs.pojo.Books" %>
<%@ page import="org.sxs.biz.BooksBiz" %><%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/28
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    /**
     * 登录
     */

    //中文处理
    request.setCharacterEncoding("utf-8");
    //获取参数值    String BOOKNAME, String STOCK
    String BOOKNAME = request.getParameter("uName");
    String STOCK = request.getParameter("pWord");
    //封装
    Books books = new Books(BOOKNAME,STOCK);
    //业务
    BooksBiz biz = new BooksBiz();
    //调用方法
    int count = biz.isLogin(books);
    System.out.println("count =" +count);
    //判断
    if (count > 0) {
        response.sendRedirect("book.html");
    } else {
        response.sendRedirect("register.html");
    }
%>

