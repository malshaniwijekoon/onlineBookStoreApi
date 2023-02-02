/* Copyright © 2021 Malshani Wijekoon.
 * All Rights Reserved.
 */

package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages={"com.example"})
//@Configuration
//@EnableAutoConfiguration
public class SpringBootSampleBasicApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootSampleBasicApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleBasicApplication.class, args);
        logger.warn("Warn Log.......");
        logger.info("Info Log.......");
        logger.debug("Debug Log.....");
        logger.error("Error Log.....");
    }
}