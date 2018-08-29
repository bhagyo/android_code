package com.example.bhagyo.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private RatingBar rat_id;
    private TextView txtvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rat_id=findViewById(R.id.d_rat_id);
        txtvw=findViewById(R.id.d_txtvw);

        txtvw.setText("Value: " + rat_id.getProgress());// eta dile amara ekebare suru thekei
                                                        // textview dekhte pabo nahole pabo na, eta ekta trick

        rat_id.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txtvw.setText("Value: "+ v);
            }
        });
    }
}
