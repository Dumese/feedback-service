package com.feedback.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.logging.Logger;

/**
 * @author Wangymeng
 * @date Created in 2022/12/18 10:49
 * @description 类描述
 */
@SpringBootApplication
@EnableSwagger2
@EnableAsync
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.feedback.service.mapper")
public class FeedBackApplication {
    private static final Logger logger = Logger.getLogger(String.valueOf(FeedBackApplication.class));
    public static void main(String[] args) {
        SpringApplication.run(FeedBackApplication.class, args);
        logger.info("========================启动成功==============================");
    }
}