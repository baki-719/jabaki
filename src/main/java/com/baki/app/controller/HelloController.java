package com.baki.app.controller;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

public class HelloController implements HttpHandler {

    public static final String URL = "hello";
    public static final HelloController INSTANCE = new HelloController();

    @Override
    public void handleRequest(HttpServerExchange exchange) {
        System.out.println("request in");
        System.out.println("exchange.getRequestURI => " + exchange.getRequestURI());
    }
}
