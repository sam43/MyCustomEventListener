package com.sam43.mycustomeventlistener.Event;

/**
 * Created by sam43 on 5/9/17.
 */

public interface IEventDispatcher {

    public void addEventListener(String type,IEventHandler cbInterface);
    public void removeEventListener(String type);
    public void dispatchEvent(EventModel event);
    public Boolean hasEventListener(String type);
    public void removeAllListeners();

}
