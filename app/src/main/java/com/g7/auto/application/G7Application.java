package com.g7.auto.application;

import android.app.Application;

import com.g7.auto.debug.recovery.callback.RecoveryCallback;
import com.g7.auto.debug.recovery.core.Recovery;
import com.g7.auto.utils.Logger;

/**
 * Created by shilin on 2017/5/18.
 */

public class G7Application extends Application{
    private final static String TAG = "G7Application";

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.d(TAG, "G7Application");

        Recovery.getInstance()
                .debug(true)
                .recoverInBackground(false)
                .recoverStack(true)
                .recoverEnabled(true)
                .callback(new MyCrashCallback())
                .silent(false, Recovery.SilentMode.RECOVER_ACTIVITY_STACK)
                .init(this);
    }

    static final class MyCrashCallback implements RecoveryCallback {
        @Override
        public void stackTrace(String exceptionMessage) {
            Logger.i(TAG, "exceptionMessage:" + exceptionMessage);
        }

        @Override
        public void cause(String cause) {
            Logger.i(TAG, "cause:" + cause);
        }

        @Override
        public void exception(String exceptionType, String throwClassName, String throwMethodName,
                              int throwLineNumber) {
            Logger.i(TAG, "exceptionClassName:" + exceptionType);
            Logger.i(TAG, "throwClassName:" + throwClassName);
            Logger.i(TAG, "throwMethodName:" + throwMethodName);
            Logger.i(TAG, "throwLineNumber:" + throwLineNumber);
        }

        @Override
        public void throwable(Throwable throwable) {

        }
    }
}
