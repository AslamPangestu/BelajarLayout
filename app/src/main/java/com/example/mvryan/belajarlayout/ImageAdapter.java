package com.example.mvryan.belajarlayout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by mvryan on 08/10/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] gambar = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round
    };

    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public Object getItem(int i) {
        return gambar[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(160,160);
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(gambar[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(160,160));
        return imageView;
    }
}
