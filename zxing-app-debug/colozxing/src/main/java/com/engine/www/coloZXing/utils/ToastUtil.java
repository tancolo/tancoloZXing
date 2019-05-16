package com.engine.www.coloZXing.utils;

import android.widget.Toast;

import static com.engine.www.coloZXing.ZXingApplication.getInstance;


/**
 * description: toast some info for user
 */
public class ToastUtil {
    private static Toast toast;

    /**
     * 短时间显示Toast
     *
     * @param info 显示的内容
     */
    public static void showToast(String info) {
        if (toast == null) {
            toast = Toast.makeText(getInstance().getApplicationContext(), info, Toast.LENGTH_SHORT);
        } else {
            toast.setText(info);
        }
        toast.show();
    }

    /**
     * 长时间显示Toast
     *
     * @param info 显示的内容
     */
    public static void showToastLong(String info) {
        if (toast == null) {
            toast = Toast.makeText(getInstance().getApplicationContext(), info, Toast.LENGTH_LONG);
        } else {
            toast.setText(info);
        }
        toast.show();
    }

    /**
     * `
     * 短时间显示Toast
     */
    public static void showToast(int resId) {
        if (toast == null) {
            toast = Toast.makeText(getInstance().getApplicationContext(),
                    getInstance().getApplicationContext().getString(resId), Toast.LENGTH_SHORT);
        } else {
            toast.setText(getInstance().getApplicationContext().getString(resId));
        }
        toast.show();
    }

    /**
     * 长时间显示Toast
     */
    public static void showToastLong(int resId) {
        if (toast == null) {
            toast = Toast.makeText(getInstance().getApplicationContext(),
                    getInstance().getApplicationContext().getString(resId), Toast.LENGTH_LONG);
        } else {
            toast.setText(getInstance().getApplicationContext().getString(resId));
        }
        toast.show();
    }

}
