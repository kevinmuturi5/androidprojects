package com.example.kevin.movies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView mmovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mmovie = findViewById(R.id.imggrid);
        ImageAdapter adapter = new ImageAdapter(this);
        mmovie.setAdapter(adapter);
       mmovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent movieDetails = new Intent(getApplicationContext(),MovieDetailsActivity.class);
               startActivity(movieDetails);
           }
       });
    }
}
