package com.example.shpora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String[] films = { "Назови меня своим именем", "Горбатая гора",
            "С любовью, Саймон", "Мальчики", "Близкие друзья"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView filmsList = findViewById(R.id.filmsList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, films);

        filmsList.setAdapter(adapter);

        filmsList.setOnItemClickListener((parent, v, position, id) -> {
            String selectedItem = films[position];
            createIntent(selectedItem);
        });
    }
    private void createIntent(String item){
        Intent intent = new Intent(this, description.class);
        intent.putExtra("film", item);
        startActivity(intent);
    }
}