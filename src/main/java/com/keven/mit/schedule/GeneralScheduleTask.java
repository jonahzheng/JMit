package com.keven.mit.schedule;

import com.keven.mit.service.IWeixinService;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import java.time.LocalDateTime;

@Slf4j
@Component
public class GeneralScheduleTask {

    @Autowired
    private IWeixinService weixinService;

    @Scheduled(fixedDelay = 6 * 60 * 1000)  //间隔6分钟
    public void first() throws InterruptedException {
        log.info("定时任务开始: " + LocalDateTime.now().toLocalTime() + " 线程 : " + Thread.currentThread().getName());
    }
}
