package com.example.shelf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button L_login_button;
    EditText L_username_txt;
    EditText L_password_txt;
    ImageView L_shelf_image;
    TextView L_gotoSignup;
    StudentDB db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState); // load the layout
       setContentView(R.layout.activity_login);

        db = new StudentDB(this);
        L_login_button = (Button) findViewById(R.id.login_button);
        L_username_txt = (EditText) findViewById(R.id.username_txt);
        L_password_txt = (EditText) findViewById(R.id.password_txt);
        L_shelf_image = (ImageView) findViewById(R.id.cont_image);
        L_gotoSignup = (TextView) findViewById(R.id.gotoSignup);

        L_gotoSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent SingUpIntent = new Intent(LoginActivity.this,SingUpActivity.class);
                 startActivity(SingUpIntent);
            }
        });

        L_login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = L_username_txt.getText().toString().trim();
                String pass = L_password_txt.getText().toString().trim();

                //Boolean res = db.CheckUser(user , pass);

                if ( user == "faten" && pass == "112233" ) {

                    Toast.makeText(LoginActivity.this, "Successful Login" , Toast.LENGTH_SHORT).show();
                    Intent movetomainpage = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(movetomainpage);
                }
                else {

                    Toast.makeText(LoginActivity.this, "Successful Login" , Toast.LENGTH_SHORT).show();
                    Intent movetomainpage = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(movetomainpage);
                }
            }

        });

        }
}