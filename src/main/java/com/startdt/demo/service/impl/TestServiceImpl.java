package com.startdt.demo.service.impl;

import com.startdt.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 测试方法实现
 *
 * @author moyu
 * @date 2022/7/11
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @Async
    @Override
    public void testThreadLog() {
        log.info("thread log test.");
    }
}
