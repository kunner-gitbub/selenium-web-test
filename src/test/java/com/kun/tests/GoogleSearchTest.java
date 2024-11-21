package com.kun.tests;

/**
 * ClassName: GoogleSearchTest
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/21/24 10:37 AM
 * @Version 1.0
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
    public static void main(String[] args) {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

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

