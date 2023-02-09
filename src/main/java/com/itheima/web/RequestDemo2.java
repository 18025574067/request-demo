package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


@WebServlet("/req2")
public class RequestDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // GET请求逻辑
        System.out.println("get....");

        // 1. 获取所有参数的map集合
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            // username:zhangsan
            System.out.print(key + ": ");
            // 获取值
            String[] values = map.get(key);
            for (String value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("====================");

        // 2. 根据参数值来获取参数值，数组
        String[] hobbies = req.getParameterValues("username");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        System.out.println("====================");

        // 3. 根据key 获取单个参数值。
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //POST请求逻辑
        System.out.println("post....");

        // 1. 获取所有参数的map集合
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            // username:zhangsan
            System.out.print(key + ": ");
            // 获取值
            String[] values = map.get(key);
            for (String value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("====================");

        // 2. 根据参数值来获取参数值，数组
        String[] hobbies = req.getParameterValues("username");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        System.out.println("====================");

        // 3. 根据key 获取单个参数值。
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);
    }
}
