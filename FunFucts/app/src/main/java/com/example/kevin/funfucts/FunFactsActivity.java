package com.example.kevin.funfucts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    TextView mFactTextView;
    Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //asign the views to corresponding variables
        mFactTextView=findViewById(R.id.factTextView);
        mShowFactButton=findViewById(R.id.ShowFactButton);
        mRelativeLayout=(RelativeLayout)findViewById(R.id.relativelayoult);

        View.OnClickListener listener= (new View.OnClickListener() {

            private String[] facts ={
                    "Olympics gold madals are mostly made of silver",
                    "You are  born with 300 bone; by the time youare an adult you wll have 206 bones",
                    "Some bamboo plants can grow almost a meter one day",
                    "It take about 8min forlight fromthe sun to reach the earth ",
                    "the state of florida is biger than england state",
                    "Some pegions can leap 2-3 meters out of the water",
                    "On averange , it takes 66 days to form a new habbit",
                    "Mammoths stll walked on earth when the great pyramind was bieng built"

            };

            @Override
            public void onClick(View v) {

                String fact = "";
                //Randomly select afact
                Random randomGenerator= new Random();
                int randomNumber= randomGenerator.nextInt(facts.length);
                fact= facts[randomNumber];

                //update the screen with a dynamic fact
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(Color.RED);
            }
        });
        mShowFactButton.setOnClickListener(listener);
    }
}
