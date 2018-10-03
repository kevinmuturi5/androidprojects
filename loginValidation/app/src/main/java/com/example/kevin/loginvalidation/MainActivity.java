package com.example.kevin.loginvalidation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private TextView text;
    private Button login;
    private int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.etuser);
        password=(EditText)findViewById(R.id.etpassword);
        login=(Button) findViewById(R.id.btnButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate(name.getText().toString(),password.getText().toString());
            }
        });
    }
    private void Validate(String name,String password){
        if ((name == "voky") && (password == "2222")){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);

        }else{
            counter--;
            if (counter==0){
                login.setEnabled(false);
            }
        }
    }
}
