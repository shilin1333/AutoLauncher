package com.g7.auto.utils;

import android.util.Log;

/**
 * Created by shilin on 2017/5/18.
 */

public class Logger {
    /**
     * 是否需要打印bug，可以在application的onCreate函数里面初始化
     */
    public static boolean isDebug = true;
    /**
     * 需要过滤的标签
     */
    public static String TAG = "com.g7.auto";

    public static void d(String msg){
        if(isDebug)
            Log.d(TAG, msg);
    }

    public static void i(String msg){
        if(isDebug)
            Log.i(TAG, msg);
    }

    public static void v(String msg){
        if(isDebug)
            Log.v(TAG, msg);
    }

    public static void e(String msg){
        if(isDebug)
            Log.e(TAG, msg);
    }

    public static void d(String tag,String msg){
        if(isDebug)
            Log.d(tag, msg);
    }

    public static void i(String tag,String msg){
        if(isDebug)
            Log.i(tag, msg);
    }

    public static void v(String tag,String msg){
        if(isDebug)
            Log.v(tag, msg);
    }

    public static void e(String tag,String msg){
        if(isDebug)
            Log.e(tag, msg);
    }
}
