package com.example.bhagyo.passdatafromactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText second_edittext;
    private Button second_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        second_button = findViewById(R.id.d_second_button);
        second_edittext = findViewById(R.id.d_second_edittext);

        second_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = second_edittext.getText().toString();
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("key",string);
                setResult(1,intent);
                finish();
            }
        });
    }
}
