package com.example.kevin.fragments1;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CameraActivity extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public CameraActivity() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static MainActivity.PlaceholderFragment newInstance(int sectionNumber) {
        MainActivity.PlaceholderFragment fragment = new MainActivity.PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_camera, container, false);

        ImageView displayimage = rootView.findViewById(R.id.imgView);


        Button takepick = rootView.findViewById(R.id.btnCam);
        takepick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent to launch camera
                Intent launchcam=new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                startActivityForResult(launchcam,1888);


            }
        });


        return rootView;
    }
}


