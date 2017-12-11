package com.engine.www.coloZXing.utils;

import android.content.pm.ActivityInfo;
import android.support.annotation.IntDef;

import com.engine.www.coloZXing.activity.CaptureActivity;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created on 2017/12/11.
 * Author: tanhaiqin
 * Description: An annotation for {@link CaptureActivity#getCurrentOrientation()}
 */

@IntDef({ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE,
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT,
        ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE,
        ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT})
@Retention(CLASS)
@Target({METHOD, PARAMETER, FIELD, LOCAL_VARIABLE})
public @interface ActivityInfoAnnotation {
}
