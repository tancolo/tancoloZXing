package com.angine.www.zxingtest;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.engine.www.coloZXing.activity.CaptureActivity;
import com.engine.www.coloZXing.utils.Constant;
import com.engine.www.coloZXing.utils.LogUtil;
import com.engine.www.coloZXing.utils.ToastUtil;
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
        startActivityForResult(intent, Constant.REQUEST_CODE_SCAN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        LogUtil.d("TANHQ===> onActivityResult: requestCode = " + requestCode + ", resultCode = " + resultCode);
        LogUtil.d("TANHQ===> onActivityResult: data = " + data);

        switch (requestCode) {
            case Constant.REQUEST_CODE_SCAN:
                handleRequestCodeScanEvent(resultCode, data);
                break;

            default:
                break;
        }
    }

    /**
     * handle the scanning event
     * @param resultCode
     * @param data
     *
     */
    private void handleRequestCodeScanEvent(int resultCode, Intent data) {
        LogUtil.d("TANHQ===> handleEvent: resultCode = " + resultCode + ", data = " + data);

        if (resultCode == RESULT_OK && data != null) {
            String result = data.getStringExtra(Constant.REQUEST_CODE_SCAN_RESULT);
            ToastUtil.showToast(result);
        }
    }

}
