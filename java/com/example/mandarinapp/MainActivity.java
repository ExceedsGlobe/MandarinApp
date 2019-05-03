package com.example.mandarinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView numberTxt,familyMembersTxt,colorsTxt,phrasesTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find the View that shows the numbers category
        numberTxt=findViewById(R.id.numbers);
        familyMembersTxt=findViewById(R.id.familyMembers);
        colorsTxt=findViewById(R.id.colors);
        phrasesTxt=findViewById(R.id.phrases);
        // Set a click listener on that View
        numberTxt.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent sendToNumbers=new Intent(MainActivity.this,NumbersActivity.class);
                // Start the new activity
                startActivity(sendToNumbers);
            }
        });
        familyMembersTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendToFamilyMembers=new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(sendToFamilyMembers);

            }
        });
        colorsTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendToColors=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(sendToColors);
            }
        });
        phrasesTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendToPhrases=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(sendToPhrases);
            }
        });
    }

}
