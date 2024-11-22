package com.kun.pomTests;

import com.kun.pom.pages.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ClassName: GoogleSearchTest
 * Package: com.kun.pomTests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 11:59 AM
 * @Version 1.0
 */

public class GoogleSearchTest {
    @Test
    public void testGoogleSearchPage() {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        //open google pave
        try {
            driver.get("https://www.google.com");

            //POM: get elements
            GoogleSearch.textSearch(driver).sendKeys("Automation step by step");
            Thread.sleep(4000);
            //GoogleSearch.buttonSearch(driver).click();
            GoogleSearch.buttonSearch(driver).sendKeys(Keys.RETURN);
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
            driver.quit();
        }


    }
}
