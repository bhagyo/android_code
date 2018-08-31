package com.example.bhagyo.zoomcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imgvw;
    private ZoomControls zomctrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvw   = findViewById(R.id.d_imgvw);
        zomctrl = findViewById(R.id.d_zomctrl);

        zomctrl.setOnZoomInClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Zoom In",Toast.LENGTH_SHORT).show();
                float x =imgvw.getScaleX();
                float y =imgvw.getScaleY();

                imgvw.setScaleX(x +1);
                imgvw.setScaleY(y +1);
            }
        });
        zomctrl.setOnZoomOutClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Zoom Out",Toast.LENGTH_SHORT).show();
                float x =imgvw.getScaleX();
                float y =imgvw.getScaleY();

                imgvw.setScaleX(x -1);
                imgvw.setScaleY(y -1);
            }
        });

    }
}
