package com.br.ciandt.myappudemy.pageObjects.Login.Robot

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.br.ciandt.myappudemy.R
import com.br.ciandt.myappudemy.pageObjects.Login.Constants.ConstantsLogin.APP_TITLE
import com.br.ciandt.myappudemy.pageObjects.Login.Constants.ConstantsLogin.MSG_SUCCESS_LOGIN
import com.br.ciandt.myappudemy.pageObjects.Login.Constants.ConstantsLogin.SUCCESS_EMAIL
import com.br.ciandt.myappudemy.pageObjects.Login.Constants.ConstantsLogin.SUCCESS_PASSWORD


class RobotLogin {
    fun checkScreenTitle(){
        onView(withText(APP_TITLE)).check(matches(isDisplayed()))
    }

    fun clearEmail(){
        onView(withId(R.id.field_email)).perform(clearText())
    }


    fun writeEmail(){
        onView(withId(R.id.field_email)).perform(typeText(SUCCESS_EMAIL))
        onView(withId(R.id.field_email)).perform(closeSoftKeyboard())
    }

    fun writePassword(){
        onView(withId(R.id.field_password)).perform(typeText(
            SUCCESS_PASSWORD))
        onView(withId(R.id.field_password)).perform(closeSoftKeyboard())

    }

    fun clickSignUp(){
        onView(withId(R.id.btn_sign_up)).perform(click())
    }

    fun validateUserLogin(){
        onView(withText(MSG_SUCCESS_LOGIN)).check(matches(isDisplayed()))
    }

    fun clickBack(){
        onView(withId(R.id.btn_back)).perform(click())
    }

}