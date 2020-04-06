package com.example.shelf;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SingUpActivity extends AppCompatActivity {
    SQLiteOpenHelper OpenHelper;
    SQLiteDatabase db;
    Button signup_button;
    EditText username_txt;
    EditText email_txt;
    EditText password_txt;
    EditText confirm_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up2);

        signup_button=(Button)findViewById(R.id.signup_button);
        username_txt=(EditText)findViewById(R.id.username_txt);
        email_txt=(EditText)findViewById(R.id.email_txt);
        password_txt=(EditText)findViewById(R.id.password_txt);
        confirm_txt=(EditText)findViewById(R.id.confirm_txt);
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LogInIntent = new Intent(SingUpActivity.this,LoginActivity.class);
                startActivity(LogInIntent);
            }
        });
    }
}
