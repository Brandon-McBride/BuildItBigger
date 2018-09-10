package com.mcbridebrandon.jokelib;

import java.util.Random;
//jokes from http://laffgaff.com/funny-one-liners/
public class JokeLibClass {
    public static String[] jokes = {
            "The first time I got a universal remote control I thought to myself, This changes everything.",

            "I've spent the last four years looking for my ex-girlfriend's killer, but no-one will do it.",

            "I refused to believe my road worker father was stealing from his job, but when I got home all the signs were there.",

            "I recently decided to sell my vacuum cleaner as all it was doing was gathering dust.",

            "My girlfriend told me to go out and get something that makes her look sexy... so I got drunk.",
    };

    // This method retrieves a random joke from the list everytime it is called.
    public String getJoke() {

        return jokes[new Random().nextInt(jokes.length)];
    }
}
