package com.kun.tests;

/**
 * ClassName: AppConfig
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/21/24 12:13 PM
 * @Version 1.0
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (FileInputStream input = new FileInputStream("src/main/resources/config.properties")) {
            // 加载属性文件
            properties.load(input);

            // 获取并打印属性值
            String appName = properties.getProperty("app.name");
            String appVersion = properties.getProperty("app.version");

            System.out.println("App Name: " + appName);
            System.out.println("App Version: " + appVersion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

