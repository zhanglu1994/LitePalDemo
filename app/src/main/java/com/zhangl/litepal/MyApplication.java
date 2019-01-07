package com.zhangl.litepal;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by zhangl on 2019/1/7.
 */

public class MyApplication extends Application{


    @Override
    public void onCreate() {
        super.onCreate();

        LitePal.initialize(this);

    }



}

