package com.haiyang.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DemoRunner
 * @Description:
 * @Author: hywang
 * @Version: 1.0
 */
//要交给spring 管理
@Component
@Order(2)
public class Demo2Runner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {

        System.out.println(" Order2  启动之前执行的代码" + strings);
    }
}
