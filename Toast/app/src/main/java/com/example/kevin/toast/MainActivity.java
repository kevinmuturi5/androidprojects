package com.example.kevin.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mToast,mCount ,mcout;
     TextView mShowCount;
     int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToast = findViewById(R.id.btnToast);
        mShowCount =findViewById(R.id.txtDisplay);
        mCount=findViewById(R.id.btnCountUp);
        mcout=findViewById(R.id.btnCountdown);
//listen to a clck event
        mToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Oooh i made it!!!", Toast.LENGTH_SHORT).show();
            }
        });
        mCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Am so happy i made it!!!", Toast.LENGTH_SHORT).show();
            }
        });
        mCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                mShowCount.setText(""+num);
            }
        });


        mcout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num--;
                mShowCount.setText(""+num);
            }
        });



    }
}
