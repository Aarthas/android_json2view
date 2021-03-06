package com.arthas.xjsonview.process;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.arthas.xjsonview.XViewComponent;
import com.arthas.xjsonview.Utils;
import com.arthas.xjsonview.XiewConfig;
import com.arthas.xjsonview.bean.XViewBody;
import com.arthas.xjsonview.process.base.LayoutProcess;
import com.arthas.xjsonview.process.base.ViewProcess;

/**
 * Created by zhangyn on 17/4/5.
 */

public class ImageViewComponent implements XViewComponent {
    public  View createComponentView(Context context, ViewGroup parent, XViewBody yiew) {


        ImageView view = new ImageView(context);
        ViewGroup.LayoutParams params = Utils.createLayoutParams(parent, yiew);
        view.setLayoutParams(params);

        ViewProcess.applyView(view, yiew);
        LayoutProcess.applyaLayout(view, params, yiew);

        applyImageView(view, yiew);




        return view;
    }

    @Override
    public void render(XViewBody yiew) {

        applyImageView((ImageView) yiew.getCurrentView(), yiew);
    }


    public static void applyImageView(ImageView view, XViewBody yiew) {
        if (view == null)
        {
            System.out.println();
        }
//        Log.d("syb", "yiew.src" + yiew.src);
        if (yiew.src != null) {
            if (yiew.src.startsWith("&")) {
                String src = Utils.getValueStringIfDataExist(yiew, yiew.src, null);
                if (src != null) {
                    yiew.src =src;
                    XiewConfig.getImageAdapter().display(view,src, yiew);
                }
            }else{
                XiewConfig.getImageAdapter().display(view, yiew.src, yiew);
            }




        }



        if (yiew.scaleType != null)
            view.setScaleType(ImageView.ScaleType.valueOf(yiew.scaleType));
        else
            view.setScaleType(ImageView.ScaleType.FIT_XY);
    }

}
