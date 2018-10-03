package com.example.kevin.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
//declare the variable to view
    TextView mDisplayUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //assign varriables to view
        mDisplayUser =findViewById(R.id.txtHi);

        //recieve intent
        Intent intent=getIntent();
        String userInput =intent.getStringExtra("user");

        mDisplayUser.setText("welcome to our app " + userInput);
    }
}
