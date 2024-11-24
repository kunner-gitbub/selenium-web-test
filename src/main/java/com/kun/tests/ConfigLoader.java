package com.kun.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName: ConfigLoader
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 3:53 PM
 * @Version 1.0
 */

public class ConfigLoader {
    public static void main(String[] args) {
        readPropertyFile();
    }
    public static void readPropertyFile(){
        Properties properties = new Properties();
        //FileInputStream fip = null;
        InputStream fip = null;
        String browser;
        try {
            //fip = new FileInputStream("src/main/resources/config.properties");
            fip = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(fip);
            browser = properties.getProperty("browser");
            System.out.println(browser);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fip != null){
                try {
                    fip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }
        }

    }
}
