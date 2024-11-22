package com.kun.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.kun.tests.GetProperty;

/**
 * ClassName: SeperateMethodTest
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/21/24 11:52 AM
 * @Version 1.0
 */

public class MethodTest {
    static WebDriver driver;
    public static String browser;

    @Test
    public void test() {
        setBrowser();
        setBrowserConfig();
        runTest();
        System.out.println("*****second test*********");
    }

    public static void setBrowser(){
        browser = "chrome";
    }
    public static void setBrowserConfig() {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }

    public static void runTest() {
        try {
            // Open Google
            driver.get("https://www.google.com");

            // Find search box, enter a query, and submit
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");
            searchBox.submit();

            // Wait for results and print page title
            Thread.sleep(2000); // Not recommended for production
            System.out.println("Page title is: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
