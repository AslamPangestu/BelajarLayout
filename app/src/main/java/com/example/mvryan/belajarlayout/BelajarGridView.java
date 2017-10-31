package com.example.mvryan.belajarlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.GridView;

/**
 * Created by mvryan on 08/10/17.
 */

public class BelajarGridView extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_gridview);
        GridView gv = (GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new ImageAdapter(this));
    }
}
