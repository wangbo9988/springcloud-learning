package com.cn.bo.service.impl;

import com.cn.bo.pojo.Result;
import com.cn.bo.pojo.User;
import com.cn.bo.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UserFallbackService
 * @Description UserService服务降级
 * @Author mr.wang
 * @Date 2020/1/14 2:35 下午
 * @Version v1.0
 */

@Component
public class UserFallbackServiceImpl implements UserService {

    @Override
    public Result insert(User user) {
        return new Result("调用失败，服务被降级", 500);
    }

    @Override
    public Result<User> getUser(Long id) {
        return new Result("调用失败，服务被降级", 500);
    }

    @Override
    public Result<List<User>> listUsersByIds(List<Long> ids) {
        return new Result("调用失败，服务被降级", 500);
    }

    @Override
    public Result<User> getByUsername(String username) {
        return new Result("调用失败，服务被降级", 500);
    }

    @Override
    public Result update(User user) {
        return new Result("调用失败，服务被降级", 500);
    }

    @Override
    public Result delete(Long id) {
        return new Result("调用失败，服务被降级", 500);
    }

}