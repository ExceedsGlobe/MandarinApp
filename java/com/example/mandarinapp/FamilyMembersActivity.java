package com.example.mandarinapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {
ArrayList<Word> familyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        familyList=new ArrayList<>();
        familyList.add(new Word("Father", "父亲",R.drawable.family_father));
        familyList.add(new Word("Mother","妈妈",R.drawable.family_mother));
        familyList.add(new Word("Son","儿子",R.drawable.family_son));
        familyList.add(new Word("Daughter","女儿",R.drawable.family_daughter));
        familyList.add(new Word("Younger brother","弟弟",R.drawable.family_younger_brother));
        familyList.add(new Word("Younger sister","妹妹",R.drawable.family_younger_sister));
        familyList.add(new Word("Grandmother","姥姥",R.drawable.family_grandmother));
        familyList.add(new Word("Grandfather","爷爷",R.drawable.family_grandfather));
        familyList.add(new Word("Elder brother","哥哥",R.drawable.family_older_brother));
        ListView listView=findViewById(R.id.familyList);
        WordAdapter adapter=new WordAdapter(this, familyList,R.color.green);
        listView.setAdapter(adapter);
    }
}
/*
* (,)
*/