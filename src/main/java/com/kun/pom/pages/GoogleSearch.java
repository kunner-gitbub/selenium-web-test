package com.kun.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * ClassName: GoogleSearch
 * Package: com.kun.pom.pages
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 11:42 AM
 * @Version 1.0
 */

public class GoogleSearch {
    private static WebElement element = null;

    public static WebElement textSearch(WebDriver driver){
        element = driver.findElement(By.name("q"));
        return element;
    }
    public static WebElement buttonSearch(WebDriver driver){
        element = driver.findElement(By.name("btnK"));
        return element;
    }

    /**
     * ClassName: GoogleSearchPageObject
     * Package: com.kun.pomTests
     * Description:
     *
     * @Author KunJiang
     * @Create 11/22/24 12:15 PM
     * @Version 1.0
     */

    public static class GoogleSearchPageObject {
        WebDriver driver = null;
        By textSearchBox = By.id("APjFqb");
        By submitSearchButton = By.name("btnK");

        public GoogleSearchPageObject() {
        }

        public GoogleSearchPageObject(WebDriver driver) {
            this.driver = driver;
        }


        public void setTextInSearchBox(String text){
            driver.findElement(textSearchBox).sendKeys(text);
        }

        public void clickSearchButton(){
            driver.findElement(submitSearchButton).sendKeys(Keys.RETURN);
        }

    }
}
