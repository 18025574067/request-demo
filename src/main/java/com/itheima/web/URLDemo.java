package com.itheima.web;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String username = "张三";

        String encode = URLEncoder.encode(username, "UTF-8");
        System.out.println(encode);
    }
}
