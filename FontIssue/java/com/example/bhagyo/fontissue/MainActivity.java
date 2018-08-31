package com.example.bhagyo.fontissue;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtvw1,txtvw2;
    private Typeface typeface1,typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvw1 = findViewById(R.id.d_txtvw1);
        txtvw2 = findViewById(R.id.d_txtvw2);

        typeface1 = Typeface.createFromAsset(getAssets(), "font/math1.ttf");
        typeface2 = Typeface.createFromAsset(getAssets(),"font/MATISSE.TTF");

        txtvw1.setTypeface(typeface1);
        txtvw2.setTypeface(typeface2);

    }
}
