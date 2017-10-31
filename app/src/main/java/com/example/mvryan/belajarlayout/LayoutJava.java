package com.example.mvryan.belajarlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mvryan on 06/10/17.
 */

public class LayoutJava extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        RelativeLayout rl  = new RelativeLayout(this);
        TextView tv = new TextView(this);
        RelativeLayout.LayoutParams tvParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        tvParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        tv.setText(("Bismillah\nAssalamu\'alaykum"));
        rl.addView(tv,tvParams);
        setContentView(rl);
    }
}
