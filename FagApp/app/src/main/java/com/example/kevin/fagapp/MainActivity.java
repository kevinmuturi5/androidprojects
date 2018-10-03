package com.example.kevin.fagapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist=findViewById(R.id.lst);
        //arry adapter
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.countries));
// Tell your adapter about the data to dislay
        mlist.setAdapter(adapter);

        mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"You are visitig"+mlist.getItemAtPosition(position),Toast.LENGTH_SHORT);
                Intent flags =new Intent(getApplicationContext(),FlagsActivity.class);
                flags.putExtra("countryName",mlist.getItemAtPosition(position).toString());
                startActivity(flags);
            }
        });
    }

}
