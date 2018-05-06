package com.example.android.pictures_for_yandex;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by klene on 01.05.2018.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mImageUrls;

    public ImageAdapter(Context c, String[] imageUrls){
        mContext = c;
        mImageUrls = imageUrls;
    }

    public int getCount(){
        return mImageUrls.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(360, 360));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        Glide.with(mContext).load(mImageUrls[position]).into(imageView);
        return imageView;
    }
}
