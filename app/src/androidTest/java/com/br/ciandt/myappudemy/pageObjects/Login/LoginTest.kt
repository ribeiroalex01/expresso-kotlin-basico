package com.br.ciandt.myappudemy.pageObjects.Login

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.br.ciandt.myappudemy.MainActivity
import com.br.ciandt.myappudemy.pageObjects.Login.Robot.RobotLogin
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTest {

    private val robot = RobotLogin()

    @get:Rule
    var mActivityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testLoginModelPage() {
        robot.checkScreenTitle()
        robot.clearEmail()
        robot.writeEmail()
        robot.writePassword()
        robot.clickSignUp()
        robot.validateUserLogin()
        robot.clickBack()
        robot.checkScreenTitle()
    }


}