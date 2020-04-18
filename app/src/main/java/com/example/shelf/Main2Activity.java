package com.example.shelf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button BBSEARCH;
    EditText TTSEARCH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BBSEARCH = (Button) findViewById(R.id.hsearch);
         TTSEARCH = (EditText) findViewById(R.id.hsearchh);
        BBSEARCH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String EnterdValue = BBSEARCH.getText().toString().trim();

                if (EnterdValue == "SE310") {

                } else {

                    Toast.makeText(activity_main2.this, "Course Not Found" , Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
