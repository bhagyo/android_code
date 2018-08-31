package com.example.bhagyo.alertdialogue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private AlertDialog.Builder alertdialoguebuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.d_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        alertdialoguebuilder = new AlertDialog.Builder(MainActivity.this);

        //for setting title
        alertdialoguebuilder.setTitle("This is title");

        //for setting message
        alertdialoguebuilder.setMessage("Here is the message");

        //for icon
        alertdialoguebuilder.setIcon(R.drawable.logo);

        //setting positive button
        alertdialoguebuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //
                finish();
            }
        });
        //setting the negative button
        alertdialoguebuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //dialogInterface.cancel();
                //amra chaile etao use korte pari, eta use korle dialogue box ti cancel hoye jabe
                Toast.makeText(MainActivity.this,"Clicked on negative button",Toast.LENGTH_SHORT).show();
            }
        });
        //setting the neutral button
        alertdialoguebuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //
                Toast.makeText(MainActivity.this,"Presed on neutral button",Toast.LENGTH_SHORT).show();
            }
        });

        //amra baire kothao click korleo dialogue box gta jabe na, jotokhn na amra kono action select korci
        alertdialoguebuilder.setCancelable(false);
        AlertDialog alertDialog = alertdialoguebuilder.create();
        alertDialog.show();
    }
}
