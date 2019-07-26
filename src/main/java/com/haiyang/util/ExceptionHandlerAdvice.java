package com.haiyang.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Auth hywang
 *  @Email hywang2017@qq.com
 * 全局的异常类
 */

@RestController
@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        e.printStackTrace();
        return "出现异常"+e.getMessage();
    }
}
