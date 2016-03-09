package com.memoryleakdetect;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MemoryLeakActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_leak);
        TextView textView = (TextView) findViewById(R.id.memory_leak);

        //below call memory leak
       MemoryModel.getInstance().setRetainedView(textView);
    }
}