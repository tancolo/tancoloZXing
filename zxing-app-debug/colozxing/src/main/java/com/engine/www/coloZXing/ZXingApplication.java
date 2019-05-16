package com.engine.www.coloZXing;

import android.annotation.SuppressLint;
import android.app.Application;

import com.engine.www.coloZXing.utils.LogUtil;
import com.squareup.leakcanary.LeakCanary;

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

        if (LeakCanary.isInAnalyzerProcess(this)) {
            LogUtil.e("TANHQ===> 111  ZXing Application!!");
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LogUtil.e("TANHQ===> 222 ZXing Application!!");

        LeakCanary.install(this);

        app = this;
    }

    /**
     * get Application instance
     */
    public static ZXingApplication getInstance() {
        return app;
    }

}
