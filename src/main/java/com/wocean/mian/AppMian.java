package com.wocean.mian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wocean")
// @SpringBootApplication 注解等价于以默认属性使用 @Configuration ， @EnableAutoConfiguration 和 @ComponentScan 。
// @ComponentScan 默认指扫描当前启动类所在的包里的对象   所以本地加一个@ComponentScan("com.wocean")
public class AppMian {
    public static void main(String[] args) {
        SpringApplication.run(AppMian.class,args);
    }
}
