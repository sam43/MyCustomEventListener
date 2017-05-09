package com.sam43.mycustomeventlistener.Event;

/**
 * Created by sam43 on 5/9/17.
 */

public class EventModel {

    public static final String COMPLETE = "complete";

    private String strType = "";
    private Object params;

    public EventModel(String type,Object params){
        initProperties(type,params);
    }

    private void initProperties(String type,Object params){
        strType = type;
        this.params = params;
    }

    public String getStrType() {
        return strType;
    }

    public Object getParams() {
        return params;
    }
}
