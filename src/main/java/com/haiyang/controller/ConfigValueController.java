package com.haiyang.controller;

import com.haiyang.util.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Auth hywang
 *  @Email hywang2017@qq.com
 *  获取到配置文件的属性
 */

@RestController
public class ConfigValueController {
    @Autowired
    private SystemConfig systemConfig;
    @RequestMapping("/getValue")
    public String getValue(){
        /*Properties properties=systemConfig.getProperties();
        String sysKey = properties.getProperty("sysKey");*/
        String sysKey=systemConfig.getProperty("sysKey");
        //String sysValue=systemConfig.getProperty("sysValue");
        String sysValue = systemConfig.getProperty("sysValue","defaultValue");
        return  "sysKey="+sysKey+",sysValue="+sysValue;
    }


}
