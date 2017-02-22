package com.sennue.hellokotlinndk

import android.support.test.rule.ActivityTestRule

import com.squareup.spoon.Spoon

import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Example spoon screenshot instrumentation test, which will execute on an Android device.
 * @see <a href="https://github.com/square/spoon">Spoon</a>
 * @see <a href="https://github.com/stanfy/spoon-gradle-plugin">Spoon Gradle Plugin</a>
 */
class ExampleScreenshotTest {
    @get:Rule
    public val mActivityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    private var mActivity: MainActivity? = null

    @Before
    fun setUp() {
        mActivity = mActivityTestRule.activity
    }

    @Test
    @Throws(Exception::class)
    fun testScreenshot() {
        Spoon.screenshot(mActivity!!, "initial_state")
    }
}