package org.sxs.servlet;

import org.sxs.biz.UserBiz;
import org.sxs.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "*.do")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //获取请求路径   /add.do
        String path = request.getServletPath();

        //截取 add
        String pathName = path.substring(1, path.lastIndexOf("."));

        //利用反射机制
        try {
            //pathName方法名; 后面2个是参数
            Method method = getClass().getDeclaredMethod(pathName, HttpServletRequest.class, HttpServletResponse.class);

            //调用
            method.invoke(this, request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //关闭
        out.flush();
        out.close();
    }

    /**
     * 注册
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void reg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //中文处理   利用过滤器处理

        //请求数据
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("userpassword");
        String sex = request.getParameter("sex");
        String borndate = request.getParameter("houseDate");
        String userTel = request.getParameter("userphone");
        String userAddress = request.getParameter("userAddress");
        String typeID = request.getParameter("userlei");


        //封装数据
        User user = new User(userId,userName,passWord,sex,borndate,userTel,userAddress,typeID);

        //调用业务对象
        UserBiz biz = new UserBiz();

        //调用业务方法
        int count = biz.add(user);

        //判断
        if (count > 0) {
            response.sendRedirect("login.html");
        } else {
            response.sendRedirect("userAdd.html");
        }

        //关闭
        out.flush();
        out.close();
    }


    /**
     * 登录
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //中文处理   利用过滤器处理

        //请求数据
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("userpassword");


        //封装数据
        User user = new User(userName, passWord);

        //调用业务对象
        UserBiz biz = new UserBiz();

        //调用业务方法
        int count = biz.add(user);

        //判断
        if (count > 0) {
            response.sendRedirect("welcome.html");
        } else {
            response.sendRedirect("userAdd.html");
        }

        //关闭
        out.flush();
        out.close();
    }

    /**
     * 显示数据
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */

    protected void all(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //中文处理   利用过滤器处理

        //调用业务对象
        UserBiz biz = new UserBiz();

        //调用业务方法
        List<User> list = biz.all();

        //保存数据
        request.setAttribute("lists", list);
        request.getRequestDispatcher("userList.jsp").forward(request, response);

        //关闭
        out.flush();
        out.close();
    }


    /**
     * 修改
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //中文处理   利用过滤器处理

        //请求数据
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("password");

            User user = new User(userId,userName, passWord);
            //调用业务对象
           UserBiz biz = new UserBiz();
            //调用业务方法
           int count = biz.update(user);
        //判断
        if (count > 0) {
            response.sendRedirect("all.do");
        } else {
            response.sendRedirect("userInfo.jsp");
        }

        //关闭
        out.flush();
        out.close();
    }


    /**
     * 删除
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //中文处理   利用过滤器处理

        //请求数据
        String userId = request.getParameter("userId");

        //调用业务对象
        UserBiz biz = new UserBiz();

        //调用业务方法
        int count = biz.delete(userId);

        //判断
        if (count > 0) {
            response.sendRedirect("all.do");
        } else {
            response.sendRedirect("userInfo.jsp");
        }

        //关闭
        out.flush();
        out.close();
    }

}
