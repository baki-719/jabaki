package com.baki.app.controller;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;
import io.undertow.util.Methods;

public class JabakiHandler implements HttpHandler {

    private static final String SLASH = "/";

    @Override
    public void handleRequest(HttpServerExchange exchange) {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "application/json");


        HelloController helloController = new HelloController();
        String result = "";
        if(refineRequestURI(exchange.getRequestURI()).equals(HelloController.URL)) {
            if (Methods.GET.equals(exchange.getRequestMethod())) {
                result = helloController.get(exchange.getQueryString());
            } else if (Methods.POST.equals(exchange.getRequestMethod())) {
                result = helloController.post(exchange.getRequestURL());
            } else if (Methods.PUT.equals(exchange.getRequestMethod())) {
                result = helloController.put(exchange.getRequestURL());
            } else if (Methods.PATCH.equals(exchange.getRequestMethod())) {
                result = helloController.patch(exchange.getRequestURL());
            } else if (Methods.DELETE.equals(exchange.getRequestMethod())) {
                result = helloController.delete(exchange.getRequestURL());
            }
        }

        exchange.getResponseSender().send(result);
    }

    private String refineRequestURI(String url) {
        return url.startsWith(SLASH) ? url.substring(1) : url;
    }
}
