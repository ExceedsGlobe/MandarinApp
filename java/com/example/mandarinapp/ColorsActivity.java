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
        colorsList.add(new Word("Red", "红色-Hóngsè"));
        colorsList.add(new Word("Green", "绿色-Lǜsè"));
        colorsList.add(new Word("Blue", "蓝色-Lán sè"));
        colorsList.add(new Word("Brown", "棕色-Zōngsè"));
        colorsList.add(new Word("Grey", "灰色-Huīsè"));
        colorsList.add(new Word("Black", "黑色-Hēisè"));
        colorsList.add(new Word("White", "白色-Báisè"));
        colorsList.add(new Word("Yellow", "黄色-Huángsè"));
        colorsList.add(new Word("Pink", "粉-Fěng"));
        colorsList.add(new Word("Orange", "橙子-Chéngzi"));
        WordAdapter adapter = new WordAdapter(this, colorsList,R.color.purple);
        listView.setAdapter(adapter);


    }
}
