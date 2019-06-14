package com.example.zhenjiuUFO;

import android.content.Context;


public class ChangeView {

    private ChangeView(){

    }

    public static int dp2px(Context context, float value){
        final float scale = Info.getDensity(context);
        return (int)(value * scale + 0.5f);
    }


    public static int px2dp(Context context, float value){
        final float scale = Info.getDensity(context);
        return (int)(value / scale + 0.5f);
    }


    public static int sp2px(Context context, float value){
        final float scale = Info.getDensity(context);
        return (int)(value * scale +0.5f);
    }


    public static int px2sp(Context context, float value){
        final float scale = Info.getDensity(context);
        return (int) (value / scale + 0.5f);
    }

}
