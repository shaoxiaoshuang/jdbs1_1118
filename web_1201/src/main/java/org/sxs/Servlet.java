package org.sxs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet",urlPatterns = "/E-mail")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //获得参数值
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        //判断
        if ("123@qq.com".equals(email) && "xxx".equals(name) && "123".equals(password)) {
            out.print("登录成功！");
        } else {
            //响应结果
            out.print("登录失败！");
        }

        out.flush();
        out.close();

    }
}
