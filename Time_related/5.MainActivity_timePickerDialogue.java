package com.example.bhagyo.timepicker;

import android.app.TimePickerDialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView txtvw;
    private TimePickerDialog timePickerDialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.d_button);
        txtvw = findViewById(R.id.d_txtvw);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        TimePicker timePicker = new TimePicker(this);
        int currentHour   = timePicker.getCurrentHour();
        int currentMinute = timePicker.getCurrentMinute() ;

        timePickerDialog = new TimePickerDialog(MainActivity.this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        String time = String.format("%d : %d",i,i1);
                        txtvw.setText(time);
                    }
                },currentHour,currentMinute,true
        );

        timePickerDialog.show();
    }
}
