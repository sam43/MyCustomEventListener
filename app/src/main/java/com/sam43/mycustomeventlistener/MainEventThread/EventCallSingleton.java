package com.sam43.mycustomeventlistener.MainEventThread;

import android.util.Log;

import com.sam43.mycustomeventlistener.Event.EventDIspatcher;
import com.sam43.mycustomeventlistener.Event.EventModel;

/**
 * Created by sam43 on 5/9/17.
 */

public class EventCallSingleton extends EventDIspatcher {

    private static final EventCallSingleton ourInstance = new EventCallSingleton();

    public static EventCallSingleton getInstance() {
        return ourInstance;
    }

    private EventCallSingleton() {
    }

    public void myCallback(){
        EventModel event = new EventModel(EventModel.COMPLETE,"my first param");
        Log.d("Event callback","i am about to dispatch event complete");
        dispatchEvent(event);
    }
}
