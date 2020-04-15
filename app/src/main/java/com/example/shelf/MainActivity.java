package com.example.shelf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button info_button;
    Button Bookmarks_button;
    Button Search_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_ctivity);

        info_button=(Button)findViewById(R.id.info_button);
        Bookmarks_button=(Button)findViewById(R.id.Bookmarks_button);
        Search_button=(Button)findViewById(R.id.Search_button);
       /* info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
       Bookmarks_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent BookmarksIntent= new Intent(MainActivity.this, BookmarksFragment.class);
               startActivity(BookmarksIntent);

           }
       });
       Search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SearchIntent= new Intent(MainActivity.this, search.class);
                startActivity(SearchIntent);

            }
        });
    }
}
