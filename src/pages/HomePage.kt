package src.pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class HomePage(private val driver: WebDriver) {

    @FindBy(xpath = "//a[@href='/home']")
    private val homeValidation: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun homeValidation(): Boolean {
        return homeValidation?.text.toString().contains("Home")
    }
}