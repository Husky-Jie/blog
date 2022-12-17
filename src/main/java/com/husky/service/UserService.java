package com.husky.service;

import com.husky.entity.User;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/17
 * Time: 19:03
 */
public interface UserService {
    User queryUser(String userOrEmail);
}
