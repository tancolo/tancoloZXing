package com.engine.www.coloZXing;

import android.annotation.SuppressLint;
import android.app.Application;

/**
 * Created on 2017/12/11.
 * Author: tanhaiqin
 * Description: Application for this app
 */

public class ZXingApplication extends Application {

    @SuppressLint("StaticFieldLeak")
    private static volatile ZXingApplication app;

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;
    }

    /**
     * get Application instance
     */
    public static ZXingApplication getInstance() {
        return app;
    }

}
