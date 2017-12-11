package com.engine.www.coloZXing.utils;

import android.content.pm.ActivityInfo;

/**
 * Created on 2017/12/11.
 * Author: tanhaiqin
 * Description: ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE, PORTRAIT, and so on!
 */

/**
 * Not Used
 */
public enum ActivityInfoEnum {
    SCREEN_ORIENTATION_LANDSCAPE(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE), //0
    SCREEN_ORIENTATION_PORTRAIT(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT), //1

    SCREEN_ORIENTATION_REVERSE_LANDSCAPE(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE), //8
    SCREEN_ORIENTATION_REVERSE_PORTRAIT(ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT) //9
    ;

    private int value;
    ActivityInfoEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
