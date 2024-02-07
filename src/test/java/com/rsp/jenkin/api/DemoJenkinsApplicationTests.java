package com.rsp.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoJenkinsApplicationTests {

    static Logger logger = (Logger) LoggerFactory.getLogger(DemoJenkinsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        assertTrue(true);
    }

}
