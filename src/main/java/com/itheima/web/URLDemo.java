package com.itheima.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String username = "张三";

        // 1. URL编码   浏览器做的步骤
        String encode = URLEncoder.encode(username, "UTF-8");
        System.out.println(encode);

        System.out.println("================");
        // 2. URL解码    tomcat做的步骤
//        String decode = URLDecoder.decode(encode, "UTF-8"); // 张三
        String decode = URLDecoder.decode(encode, "ISO-8859-1"); // å¼ ä¸
        System.out.println(decode);

        System.out.println("=================");

        // 3. 转换为字节数组   编码过程
        byte[] bytes = decode.getBytes("ISO-8859-1");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }

        System.out.println();

        System.out.println("=================");

        // 4. 将字节数组转换为字符串   解码过程
        String s = new String(bytes, "UTF-8");
        System.out.println(s);

    }
}
