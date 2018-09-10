package com.mcbridebrandon.finalproject;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class CustomTest {

    @Rule
    public final ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testJokeTextview() {
        onView(withId(R.id.btn_tellJoke)).perform(click());
        onView(withId(R.id.tv_joke)).check(matches(not(withText(""))));
    }







/*    @Test //credit to https://github.com/KKdev13/BuildItBigger-Android
    public void testAsyncTask()
    {
        String mJoke = null;
        try
        {
            JokeAsyncTask jokeTask = new JokeAsyncTask();
            jokeTask.execute(InstrumentationRegistry.getTargetContext());
            mJoke = jokeTask.get(30, TimeUnit.SECONDS);
        } catch(Exception e)
        {
            e.printStackTrace();
        }

        assertNotNull(mJoke);
    }*/
}
