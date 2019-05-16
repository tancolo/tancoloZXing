package client.zxing.shrimpcolo.com.zxinglibrarydev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.zxing.tancolo.android.CaptureActivity;

public class ZXingLibraryDevActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zxing_library_dev);
    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.btn_openCapture:
                openCapture();
                break;
        }
    }

    private void openCapture(){
        Intent intent = new Intent(ZXingLibraryDevActivity.this, CaptureActivity.class);

        startActivity(intent);
    }

}
