package com.g7.auto.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.g7.auto.R;
import com.g7.auto.base.BaseActivity;
import com.g7.auto.utils.Logger;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logger.d(TAG, "MainActivity --> onClick");
                throw new NullPointerException();
            }
        });


        Logger.d(TAG, "MainActivity --> onCreate");

    }
}
