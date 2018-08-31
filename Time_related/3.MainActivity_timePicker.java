package com.example.bhagyo.timepicker;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private Button button;
    private TextView txtvw;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.d_timepicker);
        button = findViewById(R.id.d_button);
        txtvw = findViewById(R.id.d_txtvw);

        timePicker.setIs24HourView(true);

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                String time = String.format("%d : %d", timePicker.getCurrentHour(), timePicker.getCurrentMinute());
                txtvw.setText(time);
            }
        });
    }
}
