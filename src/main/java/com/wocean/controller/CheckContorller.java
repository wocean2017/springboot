package com.wocean.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Auth hywang
 *  @Email hywang2017@qq.com
 *
 */
@RestController
public class CheckContorller {
    @RequestMapping("/check")
    public String check(){

        return "success";
    }
}
