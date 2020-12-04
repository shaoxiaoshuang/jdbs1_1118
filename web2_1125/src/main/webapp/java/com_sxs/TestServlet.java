package com_sxs;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //响应编码处理
        response.setContentType("text/html;charset=utf-8");

        //获得输出对象
         PrintWriter out = response.getWriter();

         //内容
        out.println("<h5>姓名</h5>");
        out.println("<h4>姓名</h4>");
        out.println("<h3>姓名</h3>");
        out.println("<h2>姓名</h2>");
        out.println("<h1>姓名</h1>");

         //刷新关闭
        out.flush();
        out.close();
    }
}
