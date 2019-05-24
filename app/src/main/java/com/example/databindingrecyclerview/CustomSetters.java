package com.example.databindingrecyclerview;

import android.databinding.BindingAdapter;
import android.widget.ImageButton;

public class CustomSetters {

    @BindingAdapter("imgSrc")
    public static void setImgSrc (ImageButton view, int resId){
        view.setImageDrawable(view.getContext().getDrawable(resId));

        //here you can load drawable with glide or any other library for better performance
    }

}
