package com.example.xuhongcheng.a2;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;



@RunWith(AndroidJUnit4.class)
@LargeTest
public class SimpleEspressoTest {

    private String textToFind;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void button(){
        onView(withId(R.id.editText)).perform(typeText("passwordD1"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.helloText)).check(matches(withText("Accept Password")));
    }
    @Test
    public void Button(){
        onView(withId(R.id.editText)).perform(typeText("password"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.helloText)).check(matches(withText("Not Strong")));
    }
}
