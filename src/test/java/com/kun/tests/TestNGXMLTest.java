package com.kun.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * ClassName: TestNGXMLTest
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 9:22 PM
 * @Version 1.0
 */

public class TestNGXMLTest {
    @BeforeSuite
    public void setUp(){
        System.out.println("setup");
    }
    @Test
    public void test(){
        System.out.println("run test");
    }
    @AfterSuite
    public void tearDown(){
        System.out.println("tear down");
    }
}
