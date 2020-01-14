package com.cn.bo.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName logLevelConfig
 * @Description TOD0
 * @Author mr.wang
 * @Date 2020/1/14 3:19 下午
 * @Version v1.0
 */

@Configuration
public class LogLevelConfig {

    @Bean
    Logger.Level level() {
        return Logger.Level.FULL;
    }
}
