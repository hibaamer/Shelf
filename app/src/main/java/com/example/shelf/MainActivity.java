package com.example.shelf;
import ...

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void singuppage( View view){
        Intent intent = new Intent(packageContext: this , SingUpActivity.class);
        startActivity(intent);
    }
}