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

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);
        TextView jokeTextView = findViewById(R.id.tv_joke);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
