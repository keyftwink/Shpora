package com.example.shpora;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class description extends AppCompatActivity {

    String film;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Intent intent = getIntent();
        film = intent.getStringExtra("film");

        TextView text = findViewById(R.id.textView);
        text.setText(getStringFromAssetFile());

    }
    String getStringFromAssetFile()
    {
        AssetManager am = getAssets();
        try {
            InputStream is = am.open("descriptionText.txt");
            String s = String.valueOf(is);
            is.close();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
