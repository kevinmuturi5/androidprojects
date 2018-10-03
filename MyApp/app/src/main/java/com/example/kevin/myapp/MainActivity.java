package com.example.kevin.myapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //declare variables to hold views

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText msiteToOpen,mLocationToOpen,mTextToShare;
        final Button mSite, mLocation ,mShareText , mcamera;

        //Assign the values
        msiteToOpen =findViewById(R.id.edtBrowser);
        mLocationToOpen = findViewById(R.id.edtLocation);
        mLocation=findViewById(R.id.btnlocation);
        mTextToShare=findViewById(R.id.edtShare);
        mSite= findViewById(R.id.btnOpenBrowser);
        mShareText=findViewById(R.id.btnShare);
        mcamera= findViewById(R.id.btncam);

        //set onclick listener on button
        mSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get users input
                String webPage =msiteToOpen.getText().toString();
                //parse the string to url object
                Uri uri =Uri.parse("http://"+ webPage);
                //intent for opening a browser
                Intent OpenBrowser =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(OpenBrowser);
            }
        });
        mLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get user input
                String loc = mLocationToOpen.getText().toString();
                //pass string
                Uri address= Uri.parse("geo:0,0+q="+loc);
                Intent OpenLocation =new Intent(Intent.ACTION_VIEW,address);
                startActivity(OpenLocation);
            }
        });
        mShareText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get user input
                String textToShare=mTextToShare.getText().toString();
                String Text ="text/plain";
                ShareCompat.IntentBuilder
                        .from(MainActivity.this)
                        .setType(Text)
                        .setChooserTitle("Share with:")
                        .setText(textToShare)
                        .startChooser();

            }
        });
        mcamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shot= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(shot);
            }
        });
    }
}
