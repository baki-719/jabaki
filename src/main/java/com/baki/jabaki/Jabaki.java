package com.baki.jabaki;

import com.baki.app.controller.JabakiHandler;
import io.undertow.Undertow;

public class Jabaki {

    public static final String LOCAL_HOST = "localhost";
    public static void run() {
        Undertow undertow = Undertow.builder()
                .addHttpListener(8080, LOCAL_HOST)
                .setHandler(new JabakiHandler())
                .build();
        undertow.start();
    }
}
