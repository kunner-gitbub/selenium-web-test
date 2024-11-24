package com.kun.tests;

import org.testng.TestNG;

import java.util.Arrays;

/**
 * ClassName: TestRunner
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 7:36 PM
 * @Version 1.0
 */

public class TestRunner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.setTestSuites(Arrays.asList("src/test/resources/testngParallel.xml"));
        testNG.run();
    }
}
