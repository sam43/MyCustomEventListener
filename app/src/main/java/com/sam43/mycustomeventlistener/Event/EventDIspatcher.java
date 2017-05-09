package com.sam43.mycustomeventlistener.Event;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by sam43 on 5/9/17.
 */

public class EventDIspatcher implements IEventDispatcher {

    private ArrayList<Listener> listenerList = new ArrayList<>();
    private Class<? extends EventDIspatcher> context;


    @Override
    public void addEventListener(String type, IEventHandler cbInterface) {

        Listener listener = new Listener(type,cbInterface);
        removeEventListener(type);
        listenerList.add(0,listener);

    }

    @Override
    public void removeEventListener(String type) {

        for(Iterator<Listener> iterator = listenerList.iterator(); iterator.hasNext();) {

            Listener listener = iterator.next();
            if (Objects.equals(listener.getType(), type)) {
                listenerList.remove(listener);
            }

        }

    }

    @Override
    public void dispatchEvent(EventModel event) {
        for(Iterator<Listener> iterator = listenerList.iterator();iterator.hasNext();) {
            Listener listener = iterator.next();

            if (Objects.equals(event.getStrType(), listener.getType())) {
                IEventHandler handler = listener.getHandler();
                handler.callback(event);
            }
        }
    }

    @Override
    public Boolean hasEventListener(String type) {
        return false;
    }

    @Override
    public void removeAllListeners() {
        for(Iterator<Listener> iterator = listenerList.iterator();iterator.hasNext();) {

            Listener listener = iterator.next();
            listenerList.remove(listener);
            removeAllListeners();
        }
    }
}
