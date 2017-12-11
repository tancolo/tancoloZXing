package com.angine.www.zxingtest;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.engine.www.coloZXing.activity.CaptureActivity;
import com.engine.www.coloZXing.utils.LogUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.annotations.NonNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initRxPermission();
    }

    /**
     * init rx Permissions
     */
    private void initRxPermission() {
        //add by tancolo, request the permission CAMERA
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.CAMERA,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .subscribe(new io.reactivex.functions.Consumer<Boolean>() {
                    @Override
                    public void accept(@NonNull Boolean granted) throws Exception {
                        if (granted) { // Always true pre-M
                            // I can control the camera now
                            LogUtil.d("TANHQ===> camera permission ok!");
                        } else {
                            // Oups permission denied
                            LogUtil.d("TANHQ===> camera permission error！");
                        }
                    }
                });
    }

    public void onClick(View view) {
        LogUtil.i("TANHQ===> onClick");

        Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
        startActivity(intent);
    }
}
