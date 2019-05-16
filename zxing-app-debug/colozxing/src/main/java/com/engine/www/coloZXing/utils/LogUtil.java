package com.engine.www.coloZXing.utils;

import android.util.Log;

import java.util.Locale;

/**
 * A class for debugging
 */
public class LogUtil {

    private static boolean isLogEnabled = true;// true: 开启日志; false: 关闭日志
    private static final String defaultTag = "coloZXing";// log默认的 tag
    private static final String TAG_CONTENT_PRINT = "%s.%s:%d";

    /**
     * 获得当前的 堆栈
     *
     * @return
     */
    private static StackTraceElement getCurrentStackTraceElement() {
        return Thread.currentThread().getStackTrace()[4];

    }

    /**
     * 获取是否DEBUG模式
     *
     * @return
     */
    public static boolean isDebugable() {
        return isLogEnabled;
    }

    /**
     * 打印的log信息 类名.方法名:行数--->msg
     *
     * @param trace
     * @return
     */
    private static String getContent(StackTraceElement trace) {
        return String.format(Locale.CHINA, TAG_CONTENT_PRINT, trace.getClassName(), trace.getMethodName(),
                trace.getLineNumber());
    }

    /**
     * debug
     *
     * @param tag
     * @param msg
     */
    public static void d(String tag, String msg, Throwable tr) {
        if (isLogEnabled) {
            Log.d(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg, tr);
        }
    }

    /**
     * debug
     *
     * @param tag
     * @param msg
     */
    public static void d(String tag, String msg) {
        if (isLogEnabled) {
            // getContent(getCurrentStackTraceElement())
            Log.d(tag, "--->" + msg);
        }
    }

    /**
     * debug
     *
     * @param msg
     */
    public static void d(String msg) {
        if (isLogEnabled) {
            Log.d(defaultTag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    public static void e(String msg, Throwable tr) {
        if (isLogEnabled) {
            Log.e(defaultTag, getContent(getCurrentStackTraceElement()) + "--->" + msg, tr);
        }
    }

    /**
     * error
     *
     * @param tag
     * @param msg
     */
    public static void e(String tag, String msg, Throwable tr) {
        if (isLogEnabled) {
            Log.e(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg, tr);
        }
    }

    /**
     * error
     *
     * @param tag
     * @param msg
     */
    public static void e(String tag, String msg) {
        if (isLogEnabled) {
            Log.e(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    /**
     * error
     *
     * @param msg
     */
    public static void e(String msg) {
        if (isLogEnabled) {
            Log.e(defaultTag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    /**
     * info
     *
     * @param tag
     * @param msg
     */
    public static void i(String tag, String msg, Throwable tr) {
        if (isLogEnabled) {
            Log.i(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg, tr);
        }
    }

    /**
     * info
     *
     * @param tag
     * @param msg
     */
    public static void i(String tag, String msg) {
        if (isLogEnabled) {
            Log.i(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    /**
     * info
     *
     * @param msg
     */
    public static void i(String msg) {
        if (isLogEnabled) {
            Log.i(defaultTag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    /**
     * verbose
     *
     * @param tag
     * @param msg
     */
    public static void v(String tag, String msg, Throwable tr) {
        if (isLogEnabled) {
            Log.v(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg, tr);
        }
    }

    /**
     * verbose
     *
     * @param tag
     * @param msg
     */
    public static void v(String tag, String msg) {
        if (isLogEnabled) {
            Log.v(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    /**
     * verbose
     *
     * @param msg
     */
    public static void v(String msg) {
        if (isLogEnabled) {
            Log.v(defaultTag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    /**
     * warn
     *
     * @param tag
     * @param msg
     */
    public static void w(String tag, String msg, Throwable tr) {
        if (isLogEnabled) {
            Log.w(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg, tr);
        }
    }

    /**
     * warn
     *
     * @param tag
     * @param msg
     */
    public static void w(String tag, String msg) {
        if (isLogEnabled) {
            Log.w(tag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    /**
     * warn
     *
     * @param msg
     */
    public static void w(String msg) {
        if (isLogEnabled) {
            Log.w(defaultTag, getContent(getCurrentStackTraceElement()) + "--->" + msg);
        }
    }

    /**
     * 截断输出日志
     *
     * @param msg
     */
    public static void e(String tag, String msg, String cut) {
        if (tag == null || tag.length() == 0
                || msg == null || msg.length() == 0)
            return;

        int segmentSize = 3 * 1024;
        long length = msg.length();
        if (length <= segmentSize) {// 长度小于等于限制直接打印
            Log.e(tag, msg);
        } else {
            while (msg.length() > segmentSize) {// 循环分段打印日志
                String logContent = msg.substring(0, segmentSize);
                msg = msg.replace(logContent, "");
                Log.e(tag, logContent);
            }
            Log.e(tag, msg);// 打印剩余日志
        }
    }
}
