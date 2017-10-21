package com.wocean.controller;

import com.wocean.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *  @Auth hywang
 *  @Email hywang2017@qq.com
 *
 */
@RestController
public class CheckContorller {
   private static final Logger logger = LoggerFactory.getLogger(CheckContorller.class);

    /**
     *  检查服务是否启动
     * @return
     */
    @RequestMapping("/check")
    public String check(){
        logger.info("server success");
        return "success";
    }

    /**
     * 异常处理
     * @param s
     * @return
     */
    @RequestMapping("/exc")
    public String haveExce(String s){
        //传入一个字符串的话，会出现类型转换异常
        logger.info("输入参数s {}",s);
        Integer i=Integer.parseInt(s);

        return "转换成Integer后i="+i;
    }

    /**
     * rest 风格
     * @param s
     * @return
     */
    @RequestMapping("/{s}")
    public String rest(@PathVariable("s") String s){
        logger.info("rest风格输入值为：{}",s);
        return "rest风格输入值"+s;
    }

    /**
     *  postman  请求json  {"name":"wocean", "age":12 }
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "/rest",method = RequestMethod.POST)
    public String restFul(@RequestBody UserInfo userInfo){
        logger.info("rest风格输入值为：name={},age={}",userInfo.getName(),userInfo.getAge());
        return "rest风格输入值为：name={"+userInfo.getName()+"},age={"+userInfo.getAge()+"}";
    }
}
