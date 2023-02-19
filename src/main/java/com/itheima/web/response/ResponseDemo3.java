package com.itheima.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 响应字符数据： 设置字符数据的响应体。
 */
@WebServlet("/resp3")
public class ResponseDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        // 获取字符输出流
        PrintWriter writer = resp.getWriter();

        // content-type
//        resp.setHeader("content-type", "text/html");
        writer.write("忠诚汽修厂");
        writer.write("<h1>aaa</h1>");

        // 细节： 1. 流不需要关闭，随着响应结束，resp对象被销毁，由服务器关闭。
        //       2. 中文会乱码：默认为ISO-8859-1

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
