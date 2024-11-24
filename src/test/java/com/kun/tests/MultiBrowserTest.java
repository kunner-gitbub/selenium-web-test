package com.kun.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * ClassName: MultiBrowserTest
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 7:15 PM
 * @Version 1.0
 */

public class MultiBrowserTest {
    WebDriver driver = null;

    @BeforeTest
    @Parameters("browser")
    //@Parameters("browser") //get browser info from xml file
    public void setUp(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
        }
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("automation");
    }

    @AfterTest
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
