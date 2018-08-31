package com.example.bhagyo.videoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView vdovw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vdovw = findViewById(R.id.d_vdovw);

        //String path = "android.resource://com.example.bhagyo.videoview/" + R.raw.abc;
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+ R.raw.xyz);
        vdovw.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        vdovw.setMediaController(mediaController);
        vdovw.start();

    }

}
