package com.example.zhenjiuUFO;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

import java.lang.reflect.Field;


public class Info {

    private Info(){

    }

    public static DisplayMetrics getDisplayMetrics(Context context){
        return context.getResources().getDisplayMetrics();
    }


    public static float getDensity(Context context) {
        return getDisplayMetrics(context).density;
    }


    public static int getWidthPixels(Context context) {
        return getDisplayMetrics(context).widthPixels;
    }


    public static int getHeightPixels(Context context) {
        return getDisplayMetrics(context).heightPixels;
    }


    public static int getStatusBarHeightByReflaction(Context context){
        Class<?> c = null;
        Object obj = null;
        Field field = null;
        int x = 0, sbar = 0;
        try {
            c = Class.forName("com.android.internal.R$dimen");
            obj = c.newInstance();
            field = c.getField("status_bar_height");
            x = Integer.parseInt(field.get(obj).toString());
            sbar = context.getResources().getDimensionPixelSize(x);
        } catch (Exception e) {
            L.i("get status bar height fail", e);
        }
        return sbar;
    }


    public static int getStatusBarHeight(Activity activity){
        Rect frame = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        return frame.top;
    }


    public static int getTitleBarHeight(Activity activity){
        int contentTop = activity.getWindow().findViewById(Window.ID_ANDROID_CONTENT).getTop();
        //statusBarHeight是上面所求的状态栏的高度
        int titleBarHeight = contentTop - getStatusBarHeight(activity);
        return titleBarHeight;
    }


    public static int getContentHeight(Activity activity){
        return activity.getWindow().findViewById(Window.ID_ANDROID_CONTENT).getHeight();
    }
}
