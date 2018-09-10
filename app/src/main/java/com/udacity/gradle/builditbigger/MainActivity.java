package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mcbridebrandon.displayjoke.DisplayJokeActivity;
import com.mcbridebrandon.jokelib.JokeLibClass;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //public void tellJoke(View view) {
        //TextView mJokeText;

        //mJokeText = findViewById(R.id.tv_joke_text);

        //new joke lib
        //JokeLibClass jokes = new JokeLibClass();
        //String joke = jokes.getJoke();

        //sendJokeToDisplayLibrary(joke);
        //mJokeText.setText(joke);
    //}
    public void tellJoke(View view){

        new JokeAsyncTask().execute(this);

    }
/*    private void sendJokeToDisplayLibrary(String joke) {
        Intent intent = new Intent(this, DisplayJokeActivity.class);
        intent.putExtra(DisplayJokeActivity.JOKE_KEY, joke);
        startActivity(intent);
    }*/
}
