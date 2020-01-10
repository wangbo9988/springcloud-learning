//package com.cn.bo.filter;
//
//import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//
///**
// * @ClassName HystrixRequestContextFilter
// * @Description TOD0
// * @Author mr.wang
// * @Date 2020/1/10 4:59 下午
// * @Version v1.0
// */
//@Component
//@WebFilter(urlPatterns = "/*", asyncSupported = true)
//public class HystrixRequestContextFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HystrixRequestContext context = HystrixRequestContext.initializeContext();
//
//        try {
//            filterChain.doFilter(servletRequest, servletResponse);
//        } finally {
//            context.close();
//        }
//    }
//
//}