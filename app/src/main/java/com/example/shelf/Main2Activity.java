package com.example.shelf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
                boolean EnterdValue = TTSEARCH.getText().toString().equals("SE310");

                if (EnterdValue == true ) {
                    Toast.makeText(Main2Activity.this, "Successful Serach", Toast.LENGTH_SHORT).show();
                    Intent ResultIntent = new Intent(Main2Activity.this, Search.class);
                    startActivity(ResultIntent);

                } else {

                    Toast.makeText(Main2Activity.this, "Course Not Found" , Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
