package com.example.bhagyo.labtest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1,editText2;
    private Button add_button,min_button;
    private TextView txtvw;
    Double a,b,sum,mins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListener();
    }
    private void addListener() {
        editText1     = findViewById(R.id.eT1);
        editText2     = findViewById(R.id.eT2);

        add_button    = findViewById(R.id.add_btn);
        min_button    = findViewById(R.id.minus_btn);

        txtvw         = findViewById(R.id.res);

        add_button.setOnClickListener(this);
        min_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        try {
            a = Double.parseDouble(editText1.getText().toString());
            b = Double.parseDouble(editText2.getText().toString());
            sum = a+b;
            mins= a-b;
            if(view.getId()==R.id.add_btn)
                txtvw.setText("Result is " + sum);
            if(view.getId()==R.id.minus_btn)
                txtvw.setText("Result is " + mins);
        }catch (Exception no_input){
            Toast.makeText(MainActivity.this,"Please fill both the boxes with numbers",Toast.LENGTH_LONG).show();
        }

    }
}
