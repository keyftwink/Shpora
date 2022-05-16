package com.example.shpora;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;



public class description extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Intent intent = getIntent();
        WebView textView = findViewById(R.id.xyz);
        textView.loadUrl("file:///android_asset/" + intent.getStringExtra("key"));


    }

}
