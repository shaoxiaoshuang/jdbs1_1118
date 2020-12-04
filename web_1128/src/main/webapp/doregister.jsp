<%@ page import="org.sxs.pojo.Books" %>
<%@ page import="org.sxs.biz.BooksBiz" %><%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/28
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    /**
     * 注册
     */

    //中文处理
    request.setCharacterEncoding("utf-8");
    //获取参数值  String BOOKNAME, String b_PRICE,String IMAGE, String STOCK
    String BOOKNAME = request.getParameter("userName");
    String b_PRICE = request.getParameter("rePassWord");
    String IMAGE = request.getParameter("email");
    String STOCK = request.getParameter("passWord");
    //封装
    Books books = new Books(BOOKNAME, b_PRICE, IMAGE, STOCK);
    //业务
    BooksBiz biz = new BooksBiz();
    //调用方法
    int count = biz.add(books);
    //判断
    if (count > 0) {
        response.sendRedirect("success.html");
    } else {
        response.sendRedirect("register.html");
    }
%>
