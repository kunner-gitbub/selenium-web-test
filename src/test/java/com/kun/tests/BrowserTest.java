package com.kun.tests;

/**
 * ClassName: BrowserTest
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/21/24 3:24 PM
 * @Version 1.0
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BrowserTest {

    @Test
    public void testBrowser() {
        BrowserSetup.runTest();
        System.out.println("BrowserSetup.getBrowserType() = " + BrowserSetup.getBrowserType());
        // 你可以添加更多的断言来验证页面内容
        assertTrue(true); // 这是一个示例断言
    }
}
