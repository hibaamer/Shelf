package com.example.shelf;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SingUpActivity extends AppCompatActivity {
    SQLiteOpenHelper OpenHelper;
    StudentDB db;
    Button S_signup_button;
    EditText S_username_txt;
    EditText S_email_txt;
    EditText S_password_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up2);

        db = new StudentDB(this);
        S_signup_button=(Button)findViewById(R.id.signup_button);
        S_username_txt=(EditText)findViewById(R.id.username_txt);
        S_email_txt=(EditText)findViewById(R.id.email_txt);
        S_password_txt=(EditText)findViewById(R.id.password_txt);


        S_signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean user = S_username_txt.getText().toString().isEmpty();
                boolean pass = S_password_txt.getText().toString().isEmpty();
                boolean email = S_email_txt.getText().toString().isEmpty();

                if ( user == false && pass == false && email == false ) {
                   // db.AddUser(user, pass);
                    Toast.makeText(SingUpActivity.this, "Successful SignUp", Toast.LENGTH_SHORT).show();
                    Intent movetologin = new Intent(SingUpActivity.this, LoginActivity.class);
                    startActivity(movetologin);
                }

                else{

                        Toast.makeText(SingUpActivity.this, "Error SignUp! Try Again", Toast.LENGTH_SHORT).show();
                    }

                    }

            });
    }


}
