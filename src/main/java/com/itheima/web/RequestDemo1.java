package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // String getMethod(): 获取请求方式：GET
        // String getContextPath(): 获取虚拟目录（）项目访问路径: /request-demo
        // StringBuffer getRequestURL(): 获取URL（统一资源定位符）：http://localhost:8080/request-demo/req1
        // String getRequestURI(): 获取URI（统一资源标识符）：/request-demo/req1
        // String getQueryString(): 获取请求参数（GET方式）： username=zhangsan&password=123456

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
