package com.kun.tests;

/**
 * ClassName: ExtentReportExample
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 8:35 PM
 * @Version 1.0
 */

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportExample {

    public static void main(String[] args) {
        // 配置 Extent Report
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // 创建测试
        ExtentTest test = extent.createTest("Sample Test", "This is a sample test to demonstrate Extent Reports.");

        // 初始化 WebDriver (以 Chrome 为例)
        //System.setProperty("webdriver.chrome.driver", "./chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // 测试步骤
            driver.get("https://www.google.com");
            test.pass("Navigated to Google");

            String title = driver.getTitle();
            if (title.equals("Google")) {
                test.pass("Title is correct: " + title);
            } else {
                test.fail("Title is incorrect: " + title);
            }
        } catch (Exception e) {
            test.fail("Test encountered an exception: " + e.getMessage());
        } finally {
            // 关闭浏览器
            driver.quit();
            test.info("Browser closed");
        }

        // 生成报告
        extent.flush();
    }
}

