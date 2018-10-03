package com.example.kevin.simplelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    //declare variables to hold views
    ListView mList;
    //declare an array with data
    String[] myCarsArray ={
            "Subaru,",
            "Hilda",
            "Mitsubish",
            "Ferrari",
            "toyota",
            "FoxWagon",
            "Forester"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //asign variables to view
        mList=findViewById(R.id.lstView);

        //define an adapter to set data view
        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,myCarsArray);

        //tell your list view abbout te data to display

        mList.setAdapter(adapter);


        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "item on index "+position+" is "+myCarsArray[position], Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent Subaru =new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(Subaru);
                }else if(position==1){
                    Intent hilda=new Intent(getApplicationContext(),SecondActivity.class);
                }else if (position==2){
                    Intent mitsubishi=new Intent();
                }else if (position==3){
                    Intent ferrari =new Intent();
                }else if (position==4){
                    Intent toyota =new Intent();
                }else if (position==5){
                    Intent foxwagon =new Intent();
                }else if (position==6){
                    Intent forester =new Intent();
                }
            }

        });
    }
}
