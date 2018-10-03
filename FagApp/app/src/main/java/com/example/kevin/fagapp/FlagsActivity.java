package com.example.kevin.fagapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class FlagsActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar mToolBar;
    ImageView mflags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flags);

        mToolBar= findViewById(R.id.toolbar);
        mflags= findViewById(R.id.imageView);

        //recieve intent
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            mToolBar.setTitle(bundle.getString("countryName"));
            if (mToolBar.getTitle().toString().equalsIgnoreCase("congo")){
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.congo));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("rwanda")){
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.rwanda));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("kenya")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.kenya));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("burundi")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.burundi));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("ginnie")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ginnie));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("southSudan")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.southsudan));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("eritrea")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eritrea));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("djibouti")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.djibouti));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("uganda")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.uganda));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("tanzania")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.tanzania));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("assescionisland")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.assescionisland));
            }else if(mToolBar.getTitle().toString().equalsIgnoreCase("angola")) {
                mflags.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.angola));
            }
        }
    }
}
