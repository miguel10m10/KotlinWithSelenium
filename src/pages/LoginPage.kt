package src.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class LoginPage(private val driver: WebDriver) {

    @FindBy(id = "username")
    private val userName: WebElement? = null

    @FindBy(id = "password")
    private val password: WebElement? = null

    @FindBy(id = "submit")
    private val loginButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun login(username: String, pass: String) {
        userName?.sendKeys(username)
        password?.sendKeys(pass)
        loginButton?.click()
    }
}