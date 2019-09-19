package com.keven.mit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// start
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class PreApplication {

    public static void main(String[] args) {
        log.info("服务启动成功...");
        SpringApplication.run(PreApplication.class, args);
    }
}