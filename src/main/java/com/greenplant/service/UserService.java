package com.greenplant.service;

import com.greenplant.entity.User;

/**
 * Created by lenovo on 2020/7/31.
 */
public interface UserService {

    //用户登录
    User login(User user);

    //用户注册
    void register(User user);

}
