package com.example.bhagyo.test1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private TextView m_txt;
    private Button m_btn1,m_btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_btn1 = findViewById(R.id.btn1);
        m_btn2 = findViewById(R.id.btn2);
        m_txt = findViewById(R.id.txt);

    }

    public void ShowMessage(View view) {
        if(view.getId() == R.id.btn1){
            //Toast.makeText(getApplicationContext(),"login button is clicked",Toast.LENGTH_LONG).show();
            Log.v("1st log likhlam","login button is clicked");
        }
        else{
            //Toast.makeText(getApplicationContext(),"logout button is clicked",Toast.LENGTH_LONG).show();
            Log.v("2nd log likhlam","logout button is clicked");
        }
    }
}
