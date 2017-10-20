package com.wocean.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *  @Auth hywang
 *  @Email hywang2017@qq.com
 *
 */
@RestController
public class CheckContorller {
   private static final Logger logger = LoggerFactory.getLogger(CheckContorller.class);
    @RequestMapping("/check")
    public String check(){
        logger.info("server success");
        return "success";
    }

    @RequestMapping("/exc")
    public String haveExce(String s){
        //传入一个字符串的话，会出现类型转换异常
        logger.info("输入参数s {}",s);
        Integer i=Integer.parseInt(s);

        return "转换成Integer后i="+i;
    }
}
