package com.kun.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * ClassName: GetProperty
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/21/24 12:32 PM
 * @Version 1.0
 */

public class GetProperty {
    public static String browser;
    public static void main(String[] args) {
        try {

            readPropertyFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void readPropertyFile() throws FileNotFoundException {
        Properties properties = new Properties();
        FileInputStream fip = null;
        String browser;
         try {
             fip = new FileInputStream("src/main/resources/config.properties");
             properties.load(fip);


             browser = properties.getProperty("browser");
             System.out.println(browser);
        } catch (IOException e) {
            e.printStackTrace();
        }
         finally {
             if(fip != null){

                 try {
                     fip.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         }
    }
}
