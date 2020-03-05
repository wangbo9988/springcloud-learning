package com.cn.bo.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @ClassName RedisRateLimiterConfig
 * @Description TOD0
 * @Author mr.wang
 * @Date 2020/2/24 6:14 下午
 * @Version v1.0
 */

@Configuration
public class RedisRateLimiterConfig {

//    //    根据请求参数中的username进行限流
//    @Bean
//    public KeyResolver userKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("username"));
//    }

    //    根据访问IP进行限流
    @Bean
    public KeyResolver ipKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

}
