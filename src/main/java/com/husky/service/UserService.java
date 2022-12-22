package com.husky.service;

import com.husky.entity.User;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/17
 * Time: 19:03
 */
public interface UserService {

    // 根据用户名或电子邮箱查询
    User queryUser(String userOrEmail);

    // 上传和登录的时间修改
    int PutUser(User user);

    // 注册增加用户
    int addUser(User user);

    // 查询注册的用户名或邮箱是否存在
    Integer queryNameOrEmail(String username, String email);
}
