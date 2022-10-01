package com.baki.jabaki.handler;

import io.undertow.server.handlers.PathTemplateHandler;

public class JabakiHandler extends PathTemplateHandler {

    private static final String SLASH = "/";
    public static final JabakiHandler handler = new JabakiHandler();

    private JabakiHandler() {

    }

    private String refineRequestURI(String url) {
        return url.startsWith(SLASH) ? url.substring(1) : url;
    }
}
