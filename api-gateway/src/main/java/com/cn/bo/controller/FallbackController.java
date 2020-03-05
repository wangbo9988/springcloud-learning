package com.cn.bo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FallbackController
 * @Description TOD0
 * @Author mr.wang
 * @Date 2020/2/24 9:47 上午
 * @Version v1.0
 */

@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Object fallback() {
        Map<String, Object> result = new HashMap<>();
        result.put("data", null);
        result.put("message", "Get Request Fallback");
        result.put("code", 500);
        return result;
    }
}
