package com.memoryleakdetect;

import android.widget.TextView;

public class MemoryModel {

    private static MemoryModel sInstance;
    private TextView mRetainedView;

    public static MemoryModel getInstance() {
        if (sInstance == null) {
            sInstance = new MemoryModel();
        }
        return sInstance;
    }

    public void setRetainedView(TextView textView) {
        mRetainedView = textView;
    }
}