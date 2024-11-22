package com.kun.tests;

import com.kun.pom.pages.GoogleSearchObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * ClassName: TestNgGoogleTest
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 2:17 PM
 * @Version 1.0
 */

public class TestNgGoogleTest {
    WebDriver driver;
    WebDriverWait wait;

    //environment/property setup
    @BeforeMethod
    public void setupTest() {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        // Launch Chrome browser
        driver = new ChromeDriver();
        // Initialize WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        // Maximize the browser window
        //driver.manage().window().maximize();
    }

    @Test
    public void testTestNG() throws InterruptedException {
        GoogleSearchObjects googleSearchObjects = new GoogleSearchObjects(driver);

        driver.get("https://www.google.com");
        //wait for 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        googleSearchObjects.setSearchText("Automation step to step");
        googleSearchObjects.clickSubmitButton();
        Thread.sleep(4000);


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
