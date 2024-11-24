package com.kun.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * ClassName: CustomTestListener
 * Package: com.kun.listeners
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 6:35 PM
 * @Version 1.0
 */

public class CustomTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart = " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess = " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure = " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped = " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage = " + result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout = " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart = " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish = " + context.getName());
    }
}
