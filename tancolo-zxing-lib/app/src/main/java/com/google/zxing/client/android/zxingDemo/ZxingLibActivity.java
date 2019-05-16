package com.google.zxing.client.android.zxingDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.zxing.client.android.R;
import com.google.zxing.tancolo.android.CaptureActivity;

public class ZxingLibActivity extends AppCompatActivity {

    private static final String TAG = ZxingLibActivity.class.getSimpleName();
    //private Button mBtnOpenCapture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zxing_lib);

        //mBtnOpenCapture = (Button)findViewById(R.id.btn_openCapture);

    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.btn_openCapture:
                openCapture();
                break;
        }
    }

    private void openCapture(){
        Intent intent = new Intent(ZxingLibActivity.this, CaptureActivity.class);
        startActivity(intent);
    }
}
