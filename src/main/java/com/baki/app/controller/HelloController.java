package com.baki.app.controller;

public class HelloController {
    public static final String URL = "hello";

    public String get(String param) {
        System.out.println(param);
        return "GET hello world";
    }

    public String post(String param) {
        System.out.println(param);
        return "POST hello world";
    }

    public String put(String param) {
        System.out.println(param);
        return "PUT hello world";
    }

    public String patch(String param) {
        System.out.println(param);
        return "PATCH hello world";
    }

    public String delete(String param) {
        System.out.println(param);
        return "DELETE hello world";
    }
}
