package com.trsier.communityagriculture.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/29.
 * 读取配置的api
 */
@Component
@ConfigurationProperties(prefix = "api_name")
@PropertySource("classpath:api_name.properties")
public class ApiName {

    private static final String UNDEFINED_METHOD = "未定义的方法";

    private  Map<String,String> apiNames= new HashMap<String, String>();


    public Map<String, String> getApiNames() {
        return apiNames;
    }

    public void setApiNames(Map<String, String> apiNames) {
        this.apiNames = apiNames;
    }
}
