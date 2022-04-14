package learning.android.kotlin

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CountPeoplewhenclick {

    @Rule
    @JvmField
    var activitytestrule =ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun delay()
    {
        Thread.sleep(100)
    }

    @Test
    fun AppScreen()
    {
        val button=onView(
            allOf(
                withId(R.id.mybutton),
                withText("Clickme"),
                isDisplayed()
            )
        )
        button.check(matches(isDisplayed()))
    }
}