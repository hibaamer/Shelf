package com.example.shelf;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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

    }
}
