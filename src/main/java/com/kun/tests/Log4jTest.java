package com.kun.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ClassName: Log4jTest
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 11:25 AM
 * @Version 1.0
 */

public class Log4jTest {
    private static final Logger logger = LogManager.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.trace("This is a TRACE message");
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
        logger.fatal("This is a FATAL message");
    }
}
