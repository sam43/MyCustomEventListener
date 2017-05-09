package com.sam43.mycustomeventlistener.Event;

/**
 * Created by sam43 on 5/9/17.
 */

public class Listener {

    private String type;
    private IEventHandler handler;

    public Listener(String type, IEventHandler handler) {
        this.type = type;
        this.handler = handler;
    }

    public String getType() {
        return type;
    }

    public IEventHandler getHandler() {
        return handler;
    }
}
