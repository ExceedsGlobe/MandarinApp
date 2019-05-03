package com.example.mandarinapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Word> phrasesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        listView=findViewById(R.id.phrases_list);
        phrasesList=new ArrayList<>();
        phrasesList.add(new Word("thank you so much","非常感谢。"));
        phrasesList.add(new Word("I really appreciate…","我真的很感激…"));
        phrasesList.add(new Word("where are you?","你在哪？"));
        phrasesList.add(new Word("are you coming","你来吗"));
        phrasesList.add(new Word("What do you think?","你怎么看？"));
        phrasesList.add(new Word("Thank you. That helps a lot.","谢谢。这有很大帮助。"));
        phrasesList.add(new Word("Nice to meet you.","谢谢。这有很大帮助。"));
        phrasesList.add(new Word("How can I help you?","很高兴见到你。"));
        phrasesList.add(new Word(" I’ll be with you in a moment.","我怎么帮你？ 我马上就会和你在一起。"));
        phrasesList.add(new Word ("Oh really  Actually, I thought…,","（哦，真的吗？）实际上，我想.."));
        WordAdapter wordAdapter=new WordAdapter(this,phrasesList ,R.color.blue );
        listView.setAdapter(wordAdapter);
    }
}
