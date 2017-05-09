package com.sam43.mycustomeventlistener.Event;

/**
 * Created by sam43 on 5/9/17.
 */

class Listener {

    private String type;
    private IEventHandler handler;

    Listener(String type, IEventHandler handler) {
        this.type = type;
        this.handler = handler;
    }

    String getType() {
        return type;
    }

    IEventHandler getHandler() {
        return handler;
    }
}
