package com.cn.bo.controller;

import cn.hutool.core.thread.ThreadUtil;
import com.cn.bo.pojo.Result;
import com.cn.bo.pojo.User;
import com.cn.bo.service.UserService;
import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @ClassName UserHystrixController
 * @Description TOD0
 * @Author mr.wang
 * @Date 2020/1/10 4:19 下午
 * @Version v1.0
 */

@RestController
@RequestMapping("/user")
public class UserHystrixController {

    @Autowired
    private UserService userService;

    @GetMapping("/testFallback/{id}")
    public Result testFallback(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/testException/{id}")
    public Result testException(@PathVariable Long id) {
        return userService.getUserException(id);
    }

    @GetMapping("/testCommand/{id}")
    public Result getUserCommand(@PathVariable Long id) {
        return userService.getUserCommand(id);
    }

    @GetMapping("/testCache/{id}")
    public Result testCache(@PathVariable Long id) {
        userService.getUserCache(id);
        userService.getUserCache(id);
        userService.getUserCache(id);
        return new Result("操作成功", 200);
    }

    @GetMapping("/testRemoveCache/{id}")
    public Result testRemoveCache(@PathVariable Long id) {
        userService.getUserCache(id);
        userService.removeCache(id);
        userService.getUserCache(id);
        return new Result("操作成功", 200);
    }

//    @GetMapping("/testCollapser")
//    public Result testCollapser() throws ExecutionException, InterruptedException {
//        Future<User> future1 = userService.getUserFuture(1L);
//        Future<User> future2 = userService.getUserFuture(2L);
//        future1.get();
//        future2.get();
//        ThreadUtil.safeSleep(200);
//        Future<User> future3 = userService.getUserFuture(3L);
//        future3.get();
//        return new Result("操作成功", 200);
//    }

    @GetMapping("/testCollapser")
    public Result testCollapser() throws ExecutionException, InterruptedException {
//        Future<User> future1 = userService.getUserFuture(1L);
//        Future<User> future2 = userService.getUserFuture(2L);
//        future1.get();
//        future2.get();
//        ThreadUtil.safeSleep(200);
        Future<User> future3 = userService.getUserFuture(3L);
        future3.get();
        return new Result("操作成功", 200);
    }



}
