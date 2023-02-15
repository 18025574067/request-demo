package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


@WebServlet("/req4")
public class RequestDemo4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 解决乱码：POST：getReader()
        req.setCharacterEncoding("UTF-8"); // 设置字符输入流的编码。

        // 2. 获取username
        String username = req.getParameter("username");
        System.out.println("解决乱码前：" + username);


        // 3. get 获取参数的方式： getQueryString
        // 乱码原因：tomcat进行URL解码，默认的字符集为ISO-8859-1
        // 3.1 先对乱码数据进行编码：转为字节数组 
//        byte[] bytes = username.getBytes("ISO8859-1");
//        // 3.2 字节数组解码
//        username = new String(bytes, "UTF-8");

        username = new String(username.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        System.out.println("解决乱码后：" + username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
