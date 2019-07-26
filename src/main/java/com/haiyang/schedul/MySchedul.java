package com.haiyang.schedul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 *  @Auth hywang
 *  @Email hywang2017@qq.com
 *
 */
@Configuration
@EnableScheduling
public class MySchedul {
    private static final Logger logger= LoggerFactory.getLogger("MySchedul");
    //quarzt 定时任务  20s 跑一次
    @Scheduled(cron="*/20 * * * * *")
    public void mySchedl(){
    logger.info("定时任务执行开始。。。。。。。。。。");
    logger.info("..................................");
    logger.info("定时任务执行结束。。。。。。。。。。");
    }
}
