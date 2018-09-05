package com.example.bhagyo.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imgvw;
    private TextView txtvwPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imgvw = findViewById(R.id.d_imgvw);
        txtvwPro = findViewById(R.id.d_txtvwPro);
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String string = bundle.getString("name");
            showDetails(string);
        }
    }
    void showDetails(String countryName){
        //Log.d("this the string: ",countryName);
        //Log.v("this the string: ",countryName);
        //if(countryName == "Bangladesh"
        if(countryName.equals("Bangladesh"))
        {
            imgvw.setImageResource(R.drawable.bd);
            txtvwPro.setText(R.string.bangladesh_text);
        }

        //India
        //if(countryName == "India")
        if(countryName.equals("India"))
        {
            imgvw.setImageResource(R.drawable.india);
            txtvwPro.setText(R.string.india_text);
        }
        //Nepal
        //if(countryName == "Nepal")
        if(countryName.equals("Nepal"))
        {
            imgvw.setImageResource(R.drawable.nepal);
            txtvwPro.setText(R.string.nepal_text);
        }
    }
}
