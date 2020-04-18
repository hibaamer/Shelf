package com.example.shelf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BlessedActivity extends AppCompatActivity {

    Button B_Search_button;
    EditText B_searchbyid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blessed);

        Button B_Search_button = (Button) findViewById(R.id.Search_button);
        EditText B_searchbyid = (EditText) findViewById(R.id.searchbyid);

        B_Search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String EnterdValue = B_searchbyid.getText().toString().trim();

                if (EnterdValue == "SE310") {
                    Toast.makeText(BlessedActivity.this, "Successful Serach", Toast.LENGTH_SHORT).show();
                    Intent ResultIntent = new Intent(BlessedActivity.this, Search.class);
                    startActivity(ResultIntent);

                } else {

                    Toast.makeText(BlessedActivity.this, "Course Not Found" , Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
