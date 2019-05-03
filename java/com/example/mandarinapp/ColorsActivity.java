package com.example.mandarinapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Word> colorsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        listView = findViewById(R.id.colors_list);
        colorsList = new ArrayList<>();
        colorsList.add(new Word("Red", "红色-Hóngsè",R.drawable.color_red));
        colorsList.add(new Word("Green", "绿色-Lǜsè",R.drawable.color_green));
        colorsList.add(new Word("Brown", "棕色-Zōngsè",R.drawable.color_brown));
        colorsList.add(new Word("Grey", "灰色-Huīsè",R.drawable.color_gray));
        colorsList.add(new Word("Black", "黑色-Hēisè",R.drawable.color_black));
        colorsList.add(new Word("White", "白色-Báisè",R.drawable.color_white));
        colorsList.add(new Word("Yellow", "黄色-Huángsè",R.drawable.color_mustard_yellow));
     WordAdapter adapter = new WordAdapter(this, colorsList,R.color.purple);
        listView.setAdapter(adapter);


    }
}
