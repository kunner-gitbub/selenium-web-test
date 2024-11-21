package com.kun.tests;

/**
 * ClassName: BrowserSetup
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/21/24 3:21 PM
 * @Version 1.0
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserSetup {

    // 读取配置文件中的浏览器类型
    public static String getBrowserType() {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(input);
            return properties.getProperty("browser");
        } catch (IOException e) {
            e.printStackTrace();
            return "chrome"; // 默认值
        }
    }

    // 初始化 WebDriverManager 并返回 WebDriver 实例
    public static WebDriver setupWebDriver() {
        String browser = getBrowserType();
        WebDriver driver = null;

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Unsupported browser, defaulting to Chrome.");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }

        return driver;
    }

    // 运行测试方法
    public static void runTest() {
        WebDriver driver = setupWebDriver();
        try {
            driver.get("https://www.google.com");
            System.out.println("Page Title: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
