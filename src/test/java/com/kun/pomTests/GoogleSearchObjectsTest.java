package com.kun.pomTests;

import com.kun.pom.pages.GoogleSearchObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ClassName: GoogleSeachObjectsTest
 * Package: com.kun.pomTests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 12:36 PM
 * @Version 1.0
 */

public class GoogleSearchObjectsTest {
    @Test
    public void testGoogleSearchObjects(){
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        GoogleSearchObjects googleSearchObjects = new GoogleSearchObjects(driver);
        driver.get("https://www.google.com");

        try {
            googleSearchObjects.setSearchText("Automation step to step");
            Thread.sleep(4000);

            googleSearchObjects.clickSubmitButton();

            Thread.sleep(4000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.close();
            driver.quit();
        }


    }
}
