package com.example.demo.util;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 此 demo 主要演示了 Spring Boot 如何快速实现定时任务。
 * 启动类加上@EnableScheduling
 * @author OceansHan
 * @date 2020/12/3 17:09
 */
@Component
public class TaskJob {
    @Scheduled(cron = "0/10 * * * * ?")
    public void job1(){
        System.out.println("job1开始执行");
    }
    @Scheduled(fixedRate = 2000)
    public void job2() {
        System.out.println("job2开始执行");
    }
}
