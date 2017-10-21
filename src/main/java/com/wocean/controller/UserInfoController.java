package com.wocean.controller;

import com.wocean.entity.UserInfo;
import com.wocean.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auth hywang
 * @Email hywang2017@qq.com
 * @Date 2017/10/21
 */
@RestController
public class UserInfoController {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/getUserName/{name}")
    public UserInfo getUserInfoByName(@PathVariable("name") String name){
        logger.info("参数name={}",name);
        UserInfo userInfo = userInfoService.getUserInfoByName(name);
        logger.info("查询结果是{}",userInfo.toString());
        return userInfo;
    }
}
