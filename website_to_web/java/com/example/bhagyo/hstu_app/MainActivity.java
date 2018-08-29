package com.example.bhagyo.hstu_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webvw=findViewById(R.id.d_webvw);

        WebSettings webSettings = webvw.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webvw.setWebViewClient(new WebViewClient());
        webvw.loadUrl("https://www.hstu.ac.bd/");

    }

    @Override
    public void onBackPressed() {

        if(webvw.canGoBack()){
            webvw.goBack();
        }
        else
            super.onBackPressed();
    }
}
