package com.kun.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

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
        driver.findElement(searchText).sendKeys(message);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).sendKeys(Keys.RETURN);
    }

}
