package com.example.mandarinapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    ArrayList<Word> numbersList;
    ListView numbersLstView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        // Create a list of words
        numbersList=new ArrayList<>();
        Word one=new Word("one","yi",R.drawable.number_one);
        numbersList.add(one);
        numbersList.add(new Word("two","èr",R.drawable.number_two));
        numbersList.add(new Word("three","san",R.drawable.number_three));
        numbersList.add(new Word("four","sì",R.drawable.number_four));
        numbersList.add(new Word("five","wu",R.drawable.number_five));
        numbersList.add(new Word("six","liù",R.drawable.number_six));
        numbersList.add(new Word("seven","qi",R.drawable.number_seven));
        numbersList.add(new Word("eight","ba",R.drawable.number_eight));
        numbersList.add(new Word("nine","jiu",R.drawable.number_nine));
        numbersList.add(new Word("ten","shí",R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter=new WordAdapter(this,numbersList,R.color.orange);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
         numbersLstView=findViewById(R.id.numbersList);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        numbersLstView.setAdapter(adapter);
        numbersLstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(NumbersActivity.this, numbersList.get(i).getmMandarinTranslation(), Toast.LENGTH_SHORT);

            }
        });
    }

}
