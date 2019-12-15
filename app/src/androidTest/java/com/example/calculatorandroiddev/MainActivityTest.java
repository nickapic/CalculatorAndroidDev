package com.example.calculatorandroiddev;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.No_2Btn),withText("2"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        18),
                isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.No_3Btn),withText("3"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        6),
                isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.No_4btn),withText("4"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        5),
                isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.No_5Btn),withText("5"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        0),
                isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.addbtn), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.No_6btn),withText("6"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        2),
                isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.No_5Btn),withText("5"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        0),
                isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.No_4btn),withText("4"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        5),
                isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.No_3Btn),withText("3"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        6),
                isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.No_2Btn),withText("2"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        18),
                isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.addbtn), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton11.perform(click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.equalbtn), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton12.perform(click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.clearBtn2), withText("C"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                16),
                        isDisplayed()));
        appCompatButton13.perform(click());

        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.No_5Btn),withText("5"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        0),
                isDisplayed()));
        appCompatButton14.perform(click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.No_8btn),withText("8"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        3),
                isDisplayed()));
        appCompatButton15.perform(click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.No_6btn),withText("6"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        2),
                isDisplayed()));
        appCompatButton16.perform(click());

        ViewInteraction appCompatButton17 = onView(
                allOf(withId(R.id.backspaceBtn), withText("BackSpace"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton17.perform(click());

        ViewInteraction appCompatButton18 = onView(
                allOf(withId(R.id.multiplybtn), withText("*"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton18.perform(click());

        ViewInteraction appCompatButton19 = onView(
                allOf(withId(R.id.No_9btn),withText("9"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        1),
                isDisplayed()));
        appCompatButton19.perform(click());

        ViewInteraction appCompatButton20 = onView(
                allOf(withId(R.id.No_8btn),withText("8"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        3),
                isDisplayed()));
        appCompatButton20.perform(click());

        ViewInteraction appCompatButton21 = onView(
                allOf(withId(R.id.multiplybtn), withText("*"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton21.perform(click());

        ViewInteraction appCompatButton22 = onView(
                allOf(withId(R.id.equalbtn), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton22.perform(click());

        ViewInteraction appCompatButton23 = onView(
                allOf(withId(R.id.No_9btn),withText("9"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        1),
                isDisplayed()));
        appCompatButton23.perform(click());

        ViewInteraction appCompatButton24 = onView(
                allOf(withId(R.id.No_5Btn),withText("5"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        0),
                isDisplayed()));
        appCompatButton24.perform(click());

        ViewInteraction appCompatButton25 = onView(
                allOf(withId(R.id.No_8btn),withText("8"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        3),
                isDisplayed()));
        appCompatButton25.perform(click());

        ViewInteraction appCompatButton26 = onView(
                allOf(withId(R.id.No_7btn),withText("7"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        4),
                isDisplayed()));
        appCompatButton26.perform(click());

        ViewInteraction appCompatButton27 = onView(
                allOf(withId(R.id.No_4btn),withText("4"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        5),
                isDisplayed()));
        appCompatButton27.perform(click());

        ViewInteraction appCompatButton28 = onView(
                allOf(withId(R.id.clearBtn2), withText("C"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                16),
                        isDisplayed()));
        appCompatButton28.perform(click());

        ViewInteraction appCompatButton29 = onView(
                allOf(withId(R.id.clearBtn2), withText("C"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                16),
                        isDisplayed()));
        appCompatButton29.perform(click());

        ViewInteraction appCompatButton30 = onView(
                allOf(withId(R.id.No_9btn),withText("9"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        1),
                isDisplayed()));
        appCompatButton30.perform(click());

        ViewInteraction appCompatButton31 = onView(
                allOf(withId(R.id.No_6btn),withText("6"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        2),
                isDisplayed()));
        appCompatButton31.perform(click());

        ViewInteraction appCompatButton32 = onView(
                allOf(withId(R.id.No_5Btn),withText("5"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        0),
                isDisplayed()));
        appCompatButton32.perform(click());

        ViewInteraction appCompatButton33 = onView(
                allOf(withId(R.id.No_8btn),withText("8"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        3),
                isDisplayed()));
        appCompatButton33.perform(click());

        ViewInteraction appCompatButton34 = onView(
                allOf(withId(R.id.No_4btn),withText("4"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        5),
                isDisplayed()));
        appCompatButton34.perform(click());

        ViewInteraction appCompatButton35 = onView(
                allOf(withId(R.id.No_7btn),withText("7"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        4),
                isDisplayed()));
        appCompatButton35.perform(click());

        ViewInteraction appCompatButton36 = onView(
                allOf(withId(R.id.addbtn), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton36.perform(click());

        ViewInteraction appCompatButton37 = onView(
                allOf(withId(R.id.subtractbtn), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton37.perform(click());

        ViewInteraction appCompatButton38 = onView(
                allOf(withId(R.id.No_6btn),withText("6"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        2),
                isDisplayed()));
        appCompatButton38.perform(click());

        ViewInteraction appCompatButton39 = onView(
                allOf(withId(R.id.No_5Btn),withText("5"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        0),
                isDisplayed()));
        appCompatButton39.perform(click());

        ViewInteraction appCompatButton40 = onView(
                allOf(withId(R.id.No_8btn),withText("8"),
                childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        3),
                isDisplayed()));
        appCompatButton40.perform(click());

        ViewInteraction appCompatButton41 = onView(
                allOf(withId(R.id.equalbtn), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton41.perform(click());

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
