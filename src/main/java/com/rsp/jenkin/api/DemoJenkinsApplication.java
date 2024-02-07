package com.rsp.jenkin.api;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DemoJenkinsApplication {

    static Logger logger = (Logger) LoggerFactory.getLogger(DemoJenkinsApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application started...");
    }
    public static void main(String[] args) {
        logger.info("Application executed...");
        SpringApplication.run(DemoJenkinsApplication.class, args);
    }

}
