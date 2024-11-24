package com.kun.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * ClassName: ListenerTest
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 6:42 PM
 * @Version 1.0
 */

public class ListenerTest {
    @Test
    public void test1(){
        System.out.println("inside test1");
    }
    @Test
    public void test2(){
        System.out.println("inside test2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("automation");
        //driver.findElement(By.name("a"));
        driver.quit();

    }
}
