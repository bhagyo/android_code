package com.example.bhagyo.timepicker;

import android.app.TimePickerDialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextClock textClock;
    private AnalogClock analogClock;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textClock = findViewById(R.id.d_textclock);
        analogClock = findViewById(R.id.d_analogclock);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.d_analogclock){
            Toast.makeText(MainActivity.this,"analog clock is selected",Toast.LENGTH_SHORT).show();
        }
        if(view.getId() == R.id.d_textclock){
            Toast.makeText(MainActivity.this,"TEXT clock is selected",Toast.LENGTH_SHORT).show();
        }
    }
}
