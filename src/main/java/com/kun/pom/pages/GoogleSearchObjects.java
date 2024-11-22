package com.kun.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * ClassName: GoogleSearchObjects
 * Package: com.kun.pom.pages
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 12:30 PM
 * @Version 1.0
 */

public class GoogleSearchObjects {
    WebDriver driver = null;
    By searchText = By.id("APjFqb");
    By submitButton = By.name("btnK");

    public GoogleSearchObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearchText(String message){
        //method1
        //driver.findElement(searchText).sendKeys(message);

        //method2
        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait for the search input field to be visible and clickable
        //WebElement searchInput = wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchText)));
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(searchText));
        searchInput.sendKeys(message);
    }

    public void clickSubmitButton(){
        //driver.findElement(submitButton).sendKeys(Keys.RETURN);
        //driver.findElement(submitButton).click();
        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the submit button to be clickable
        WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitBtn.click(); // Click the submit button
    }

}
