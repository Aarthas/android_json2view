package com.yi.bean;

import java.util.ArrayList;

/**
 * Created by zhangyn on 17/3/31.
 */

public class Yiew extends YiewBean {

    public static final String verticalLayout = "verticalLayout";
    public static final String horizonLayout = "horizonLayout";
    public static final String TextView = "TextView";
    public static final String ImageView = "ImageView";
    public static final String View = "View";
    public static final String ScrollView = "ScrollView";
    public static final String scrollView = "scrollView";
    public static final String RelativeLayout = "RelativeLayout";
    public static final String FrameLayout = "FrameLayout";
    public static final String LinearLayout= "LinearLayout";;



    public static final String MATCH = "match";
    public static final String WRAP = "wrap";


    public transient Yiew parentNode;



    public void addChild(Yiew yiew) {
        if (child == null)
        {
            child = new ArrayList<>();

        }
        child.add(yiew);
    }




    public static Yiew create(String type, String width, String height) {
        Yiew yiew = new Yiew();
        yiew.view = type;
        yiew.width = width;
        yiew.height = height;
        return yiew;
    }
}
