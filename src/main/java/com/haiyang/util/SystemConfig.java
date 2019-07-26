package com.haiyang.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.Properties;

/**
 *  @Auth hywang
 *  @Email hywang2017@qq.com
 *  获取到配置文件的属性
 */

@Component
public class SystemConfig {

    private static Properties props ;

    public SystemConfig(){

        try {
            Resource resource = new ClassPathResource("/application.properties");
            props = PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取属性
     * @param key
     * @return
     */
    public  String getProperty(String key){

        return props == null ? null :  props.getProperty(key);

    }

    /**
     * 获取属性
     * @param key 属性key
     * @param defaultValue 属性value
     * @return
     */
    public  String getProperty(String key,String defaultValue){

        return props == null ? null : props.getProperty(key, defaultValue);

    }

    /**
     * 获取properyies属性
     * @return
     */
    public  Properties getProperties(){
        return props;
    }

}
