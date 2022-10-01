package com.baki;

import com.baki.app.controller.HelloController;
import com.baki.jabaki.Jabaki;
import com.baki.jabaki.handler.JabakiHandler;

public class Main {
    public static void main(String[] args) {
        registerHandler();
        Jabaki.run();
    }

    private static void registerHandler() {
        JabakiHandler.handler
                .add(HelloController.URL, HelloController.INSTANCE);
    }
}