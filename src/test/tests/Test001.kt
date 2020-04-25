package src.test.tests

import org.testng.Assert
import org.testng.annotations.Test
import src.pages.HomePage
import src.pages.LoginPage
import src.test.TestBase
import src.utils.UtilResources

class LoginSuccessful() : TestBase() {

    @Test
    fun loginSuccessful() {

        val homePage = HomePage(driver!!)
        val loginPage = LoginPage(driver!!)

        //login
        loginPage.login(UtilResources.getProperties("username"), UtilResources.getProperties("password"))

        //home validation
        val homeValidation = homePage.homeValidation()
        Assert.assertTrue(homeValidation)
    }
}