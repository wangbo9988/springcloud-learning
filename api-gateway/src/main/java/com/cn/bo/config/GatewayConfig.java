//package com.cn.bo.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @ClassName GatewayConfig
// * @Description TOD0
// * @Author mr.wang
// * @Date 2020/2/18 11:29 下午
// * @Version v1.0
// */
//
//@Configuration
//public class GatewayConfig {
//
//    @Bean
//    public RouteLocator customerRouteLocter(RouteLocatorBuilder routeLocatorBuilder) {
//
//        return routeLocatorBuilder.routes().route("path_route2", r -> r.path("/user/getByUsername")
//                .uri("http://localhost:8201/user/getByUsername")).build();
//
//    }
//
//}
