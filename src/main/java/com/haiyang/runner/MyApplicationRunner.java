package com.haiyang.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyApplicationRunner
 * @Description:
 * @Author: hywang
 * @CreateDate: 2019-07-26 15:09
 * @Version: 1.0
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("MyApplicationRunner" + applicationArguments);
    }
}
