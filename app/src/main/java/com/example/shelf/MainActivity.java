package com.example.shelf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button info_button;
    Button Bookmarks_button;
    Button Search_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_ctivity);

        info_button=(Button)findViewById(R.id.info_button); //PROFILE ACTIVITY
        Bookmarks_button=(Button)findViewById(R.id.Bookmarks_button); //BOOKMARKS ACTIVITY
        Search_button=(Button)findViewById(R.id.Search_button); // main2 ACTIVITY


       info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent ProfileIntent= new Intent(MainActivity.this,  profile_Activity.class);
               startActivity(ProfileIntent);
            }
        });


       Bookmarks_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              Intent BookmarksIntent= new Intent(MainActivity.this, BookmarksActivity.class);
               startActivity(BookmarksIntent);

           }
       });



       Search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SearchIntent= new Intent(MainActivity.this, Main2Activity.class);
                startActivity(SearchIntent);

            }
        });
    }
}
