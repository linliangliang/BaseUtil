package com.zhengyuan.baseutil;

import android.app.Application;
import android.content.Context;

/**
 * Created by 林亮 on 2018/11/28
 * MyApplication 存放上下文context
 */

public class MyApplication extends Application {
    /**
     * 系统上下文
     */
    private static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = getApplicationContext();

    }

    /**
     * 获取系统上下文：用于ToastUtil类
     */
    public static Context getAppContext() {
        return mAppContext;
    }
}
