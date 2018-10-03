package com.example.kevin.movies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    Context mContext;
    int[] images = {R.drawable.americanpshyco,R.drawable.batman,R.drawable.oblivion,R.drawable.starwars,R.drawable.sweatybeards,
    R.drawable.zombieland,R.drawable.captainamerica,R.drawable.download,R.drawable.zombieland,R.drawable.sweatybeards};

    public ImageAdapter(Context mContext){
        this.mContext = mContext;
    }
    @Override
    public int getCount(){return images.length;}

    @Override
    public Object getItem(int position){return images[position];}

    @Override
    public long getItemId(int position){return 0; }
    @Override
    public View getView(int position, View convertView , ViewGroup parent){
        ImageView image=new ImageView(mContext);
        image.setImageResource(images[position]);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return image;
    }

}
