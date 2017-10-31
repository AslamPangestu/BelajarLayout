package com.example.mvryan.belajarlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mvryan on 06/10/17.
 */

public class BelajarListView extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_listview);
        ListView lv = (ListView) findViewById(R.id.listview1);
        List<String> data = new ArrayList<String>();
        data.add("Satu");
        data.add("Dua");
        data.add("Tiga");
        data.add("Empat");
        data.add("Lima");
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);
        lv.setAdapter(aa);
    }
}
