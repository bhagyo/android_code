package com.example.bhagyo.picture_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button logbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logbtn = findViewById(R.id.buttonID);
        logbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        LayoutInflater inflater = getLayoutInflater();

        View customView= inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.customToastID));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(customView);
        toast.show();
    }
}
