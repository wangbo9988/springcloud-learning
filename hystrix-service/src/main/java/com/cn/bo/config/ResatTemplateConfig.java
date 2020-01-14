package com.cn.bo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ResatTemplateConfig
 * @Description TOD0
 * @Author mr.wang
 * @Date 2020/1/10 5:10 下午
 * @Version v1.0
 */

@Configuration
public class ResatTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
