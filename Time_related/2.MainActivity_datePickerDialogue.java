package com.example.bhagyo.timepicker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtvw;
    private DatePickerDialog datePickerDialog;
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.d_button);
        txtvw = findViewById(R.id.d_txtvw);


        button.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        DatePicker datePicker = new DatePicker(this);
        int currentDate       = datePicker.getDayOfMonth();
        int currentMonth      = datePicker.getMonth()+1; //month counting start from 0, so we add 1
        int currentYear       = datePicker.getYear();

        datePickerDialog = new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        txtvw.setText(i2 +"/"+(i1+1)+"/"+i); // i2=dayOfMonth,i1=Month, i=year
                    }
                },currentYear,currentMonth,currentDate);
        datePickerDialog.show();
    }
}
