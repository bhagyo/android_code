package com.example.bhagyo.countryprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1,btn2,btn3;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.d_btn1);
        btn2 = findViewById(R.id.d_btn2);
        btn3 = findViewById(R.id.d_btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.d_btn1) {
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }
        if(view.getId() == R.id.d_btn2){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }
        if(view.getId() == R.id.d_btn3){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Nepal");
            startActivity(intent);
        }
    }
}
