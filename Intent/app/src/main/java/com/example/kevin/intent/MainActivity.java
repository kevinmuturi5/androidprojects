package com.example.kevin.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //asssign variables to view
    EditText mUser;
    Button mNavigate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUser =findViewById(R.id.edtUser);
        mNavigate=findViewById(R.id.btnNavigate);
      //  listen for aclickeven
        mNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ntent to a new activity
                String username = mUser.getText().toString();
                Intent navigateToSecond = new Intent(getApplicationContext(),SecondActivity.class);
                navigateToSecond.putExtra("user",username);
                startActivity(navigateToSecond);
            }
        });
    }
}
