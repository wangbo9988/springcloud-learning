package com.cn.bo.service;

import com.cn.bo.pojo.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TOD0
 * @Author mr.wang
 * @Date 2020/1/10 10:35 上午
 * @Version v1.0
 */
public interface UserService {

    void insert(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> listUsersByIds(List<Long> ids);

}
