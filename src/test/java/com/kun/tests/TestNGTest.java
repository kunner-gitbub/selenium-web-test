package com.kun.tests;

/**
 * ClassName: TestNGTest
 * Package: com.kun.pomTests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/22/24 2:09 PM
 * @Version 1.0
 */

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Setting up tests...");
    }

    @Test
    public void testSum() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        Assert.assertEquals(sum, 8, "Sum is incorrect!");
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int difference = a - b;
        Assert.assertEquals(difference, 6, "Subtraction is incorrect!");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Tests completed.");
    }
}

