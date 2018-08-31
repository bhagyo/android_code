package com.example.bhagyo.timepicker;

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
    private DatePicker datePicker;
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.d_button);
        txtvw = findViewById(R.id.d_txtvw);
        datePicker = findViewById(R.id.d_datepicker);

        txtvw.setText(currentDate());

        button.setOnClickListener(this);
    }

    String currentDate(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current Date:");
        stringBuilder.append(datePicker.getDayOfMonth()+ "/");
        stringBuilder.append(datePicker.getMonth() +1 + "/"); // get month 0 theke counting suru kore tai 1 plus korlam
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();

    }

    @Override
    public void onClick(View view) {
        txtvw.setText(currentDate());
    }
}
