package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView portfolio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        portfolio = findViewById(R.id.portfolio);
        portfolio.getSettings().setJavaScriptEnabled(true);
        portfolio.setWebViewClient(new WebViewClient());
        //portfolio.loadUrl("https://atanu-paul.netlify.app/");
        portfolio.loadUrl("https://noteitdownbyatanu.vercel.app/");
    }
}