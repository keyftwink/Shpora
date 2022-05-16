package com.example.shpora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView topFilmList = findViewById(R.id.topFilmList);

        String[] film = getResources().getStringArray(R.array.films);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, film);

        topFilmList.setAdapter(adapter);

        Intent intent = new Intent(this, description.class);
        topFilmList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                intent.putExtra("key", ((TextView)v).getText() + ".html");
                startActivity(intent);
            }
        });
    }
}