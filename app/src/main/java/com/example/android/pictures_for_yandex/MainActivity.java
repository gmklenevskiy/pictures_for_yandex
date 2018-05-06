package com.example.android.pictures_for_yandex;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    public static String[] images = {
            "https://i.imgur.com/z3TNYM3.jpg",
            "http://i.imgur.com/C9pBVt7.jpg",
            "https://i.imgur.com/NP5KqPT.jpg",
            "http://i.imgur.com/aIy5R2k.jpg",
            "https://i.imgur.com/IzcqoJl.jpg",
            "http://i.imgur.com/S963yEM.jpg",
            "https://i.imgur.com/gjblaCx.jpg",
            "http://i.imgur.com/SEPdUIx.jpg",
            "https://i.imgur.com/WPBhiH8.jpg",
            "http://i.imgur.com/76Jfv9b.jpg",
            "https://i.imgur.com/RTdYvUt.jpg",
            "http://i.imgur.com/syELajx.jpg",
            "https://i.imgur.com/BwhrMGz.jpg",
            "http://i.imgur.com/Z3QjilA.jpg",
            "https://i.imgur.com/VWDbYUb.jpg",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,images));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("pictureUrls",images);
                intent.putExtra("picturePosition",position);
                startActivity(intent);
        }
        });
    }



}
