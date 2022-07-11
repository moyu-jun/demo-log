package com.startdt.demo.controller;

import com.startdt.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moyu
 */
@Slf4j
@RestController("test")
@RequiredArgsConstructor
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    private final TestService testService;

    @GetMapping("/log")
    public String testLog() {
        // 注解方式
        log.info("log info.");
        log.error("log error.");
        log.warn("log warn.");
        if (log.isDebugEnabled()) {
            log.debug("log debug.");
        }

        // org.slf4j.LoggerFactory 方式
        logger.info("logger info.");
        logger.error("logger error.");
        logger.warn("logger warn.");
        if (logger.isDebugEnabled()) {
            logger.debug("logger debug.");
        }

        testService.testThreadLog();
        return "ok";
    }
}
