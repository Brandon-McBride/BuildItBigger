package com.udacity.gradle.builditbigger.backend;
import com.mcbridebrandon.jokelib.JokeLibClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        return new JokeLibClass().getJoke();
    }

    //public void setData(String data) {
      //  myData = data;
    //}
}