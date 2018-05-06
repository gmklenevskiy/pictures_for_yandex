package com.example.android.pictures_for_yandex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by klene on 01.05.2018.
 */

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom_layout);

        ImageView mImageView = (ImageView) findViewById(R.id.image);
        Intent intent = getIntent();
        String[] pictureUrls = intent.getStringArrayExtra("pictureUrls");
        int picturePosition = intent.getIntExtra("picturePosition",0);
        Glide.with(this).load(pictureUrls[picturePosition]).into(mImageView);
    }
}
