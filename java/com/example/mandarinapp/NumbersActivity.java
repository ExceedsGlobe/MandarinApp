package com.example.mandarinapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    ArrayList<Word> numbersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        // Create a list of words
        numbersList=new ArrayList<>();
        Word one=new Word("one","yi" );
        numbersList.add(one);
        numbersList.add(new Word("two","èr"));
        numbersList.add(new Word("three","san"));
        numbersList.add(new Word("four","sì"));
        numbersList.add(new Word("five","wu"));
        numbersList.add(new Word("six","liù"));
        numbersList.add(new Word("seven","qi"));
        numbersList.add(new Word("eight","ba"));
        numbersList.add(new Word("nine","jiu"));
        numbersList.add(new Word("ten","shí"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter=new WordAdapter(this,numbersList,R.color.orange);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView numbersLstView=findViewById(R.id.numbersList);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        numbersLstView.setAdapter(adapter);

    }
}
