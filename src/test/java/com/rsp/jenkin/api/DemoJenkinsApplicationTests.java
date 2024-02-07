package com.rsp.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoJenkinsApplicationTests {

    static Logger logger = LoggerFactory.getLogger(DemoJenkinsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        assertTrue(true);
        logger.info("Test case executed.");
    }

}
