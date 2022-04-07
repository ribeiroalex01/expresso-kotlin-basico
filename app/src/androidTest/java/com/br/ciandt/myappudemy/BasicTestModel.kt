package com.br.ciandt.myappudemy

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class BasicTestModel {

    @get:Rule
    var mActivityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testelogin() {
        onView(withText("Test Application")).check(matches(isDisplayed()))
        onView(withId(R.id.field_email)).perform(clearText())
        onView(withId(R.id.field_email)).perform(typeText("alexbruno@ciandt.com"))
        closeSoftKeyboard()
        onView(withId(R.id.field_password)).perform(typeText("12345678"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_sign_up)).perform(click())
        onView(withText("Login successfully!")).check(matches(isDisplayed()))
        onView(withId(R.id.btn_back)).perform(click())
        onView(withText("Test Application")).check(matches(isDisplayed()))
    }
}