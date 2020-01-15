package com.cn.bo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Description TOD0
 * @Author mr.wang
 * @Date 2020/1/15 9:30 上午
 * @Version v1.0
 */

@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @Value("${test.info}")
    private String testConfig;

    @Value("${boot}")
    private String boot;

    @GetMapping("/configInfo")
    public String getConfigInfo() {

        System.out.println(testConfig);
        System.out.println(boot);

        return configInfo;

    }

}
