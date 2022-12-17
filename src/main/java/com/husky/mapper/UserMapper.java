package com.husky.mapper;

import com.husky.entity.User;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/17
 * Time: 18:58
 */
public interface UserMapper {

    // 根据用户名或电子邮箱查询
    User selectUser(String userOrEmail);

    // 上传和登录的时间修改
    int UpdateUploadLoginTime(User user);
}
