package com.mcbridebrandon.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    public static String JOKE_KEY = "jokekey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeTextView = findViewById(R.id.tv_joke);

        Intent intent = getIntent();

        if(intent.hasExtra(JOKE_KEY)){
            String joke = intent.getStringExtra(JOKE_KEY);

            if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

        }else{
            //error here
            jokeTextView.setText("Error The Joke Is Broken");
        }
    }
}
