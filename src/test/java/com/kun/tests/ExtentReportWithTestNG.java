package com.kun.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;

/**
 * ClassName: ExtentReportWithTestNG
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 8:43 PM
 * @Version 1.0
 */

public class ExtentReportWithTestNG {
    ExtentSparkReporter sparkReporter;
    ExtentReports extent;

    @BeforeSuite //will be run only once
    public void setUp() {
        System.out.println("setup environment");
        sparkReporter = new ExtentSparkReporter("extent-report1.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    @Test
    public void test1() {

        // 创建测试
        ExtentTest test = extent.createTest("Sample Test", "This is a sample test to demonstrate Extent Reports.");
        System.out.println("test1");
        test.pass("Print test1");

    }

    @Test
    public void test2() {
        // 创建测试
        ExtentTest test = extent.createTest("Sample Test", "This is a sample test to demonstrate Extent Reports.");
        System.out.println("test2");
        test.pass("Print test2");
    }

    @AfterSuite //will be run only once
    public void tearDown() {
        System.out.println("tearDown!");
        // 生成报告
        extent.flush();
    }
}
