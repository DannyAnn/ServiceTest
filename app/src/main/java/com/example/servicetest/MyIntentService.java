package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentService";

    public MyIntentService(){
        super("MyIntentService");//调用父类的有参构造函数
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG,"Thread id is"+Thread.currentThread().getId());
    }
}
