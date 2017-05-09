package com.sam43.mycustomeventlistener.MainEventThread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.sam43.mycustomeventlistener.Event.EventModel;
import com.sam43.mycustomeventlistener.Event.IEventHandler;
import com.sam43.mycustomeventlistener.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventCallSingleton mCallEvent = EventCallSingleton.getInstance();

        mCallEvent.addEventListener(EventModel.COMPLETE, new IEventHandler() {
            @Override
            public void callback(EventModel event) {
                Log.d("Event callback","i am in callback "+event.getStrType()+" :: param = "+event.getParams());
            }
        });

        Log.d("Event callback","i am going to call");
        mCallEvent.myCallback();

    }
}
