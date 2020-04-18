package com.example.shelf;
// DO NOT DELETE THIS FILE PLEASE "FATEN"

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BookmarksActivity extends AppCompatActivity {

    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookmark_items);

        image1 = (ImageView) findViewById(R.id.cont_image);

    }

}


