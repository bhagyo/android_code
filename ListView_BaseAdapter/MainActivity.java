package com.example.bhagyo.listview_baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;
    private int[] flags = {R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd,
                        R.drawable.ee,R.drawable.ff,R.drawable.gg,R.drawable.hh,
                        R.drawable.ii,R.drawable.jj,R.drawable.kk,R.drawable.ll,
                        R.drawable.mm,R.drawable.nn,R.drawable.oo};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.d_main);
        countryNames = getResources().getStringArray(R.array.country_name);
        CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
        listView.setAdapter(adapter);
    }
}
