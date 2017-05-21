package com.g7.auto.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by shilin on 2017/5/18.
 */

public abstract class BaseActivity extends Activity {
    protected int mWidth;
    protected int mHeight;
    protected Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // 设置横屏
        context = BaseActivity.this;

        WindowManager manager = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(dm);

        mWidth = dm.widthPixels;
        mHeight = dm.heightPixels;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
