package src.test

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import src.utils.UtilResources
import java.net.URI
import java.util.concurrent.TimeUnit

abstract class TestBase {

    lateinit var driver: WebDriver
        private set

    @BeforeTest
    fun setup() {
        System.setProperty(UtilResources.getProperties("nameDriver"),
                System.getProperty("user.dir") +
                        UtilResources.getProperties("pathDriver") +
                        UtilResources.getProperties("exeDriver"))
        driver = ChromeDriver()
        driver?.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
        driver?.manage()?.window()?.maximize()
        driver?.get(URI(UtilResources.getProperties("pageURL")).toString())
    }

    @AfterTest
    fun driverClose() {
        driver?.close();
    }
}
