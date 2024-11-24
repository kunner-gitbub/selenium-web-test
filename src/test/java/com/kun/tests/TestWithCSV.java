package com.kun.tests;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * ClassName: TestWithCSV
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 4:54 PM
 * @Version 1.0
 */

public class TestWithCSV {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "csvData")
    public Object[][] readCSVData() throws IOException {
        String filePath = "src/main/resources/test-data.csv";
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> data = null;
            try {
                data = reader.readAll();
            } catch (CsvException e) {
                e.printStackTrace();
            }
            Object[][] testData = new Object[data.size()-1][1];//从第二行读
            for (int i = 1; i < data.size(); i++) {
                testData[i-1][0] = data.get(i)[0];//忽略第一行数据
            }
            return testData;
        }
    }

    @Test(dataProvider = "csvData")
    public void testGoogleSearch(String searchMessage) {
        // 打开 Google
        driver.get("https://www.google.com");
        // 查找搜索框并输入查询词
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchMessage);
        searchBox.submit();
        // 验证结果是否加载
        WebElement results = driver.findElement(By.id("search"));
        assert results.isDisplayed();
    }
}
