package com.husky.service.impl;

import com.husky.entity.User;
import com.husky.mapper.UserMapper;
import com.husky.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/17
 * Time: 19:04
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    // 根据用户名或电子邮箱查询
    @Override
    public User queryUser(String userOrEmail) {
        return userMapper.selectUser(userOrEmail);
    }

    // 上传和登录的时间修改
    @Override
    public int PutUploadLoginTime(User user) {
        return userMapper.UpdateUploadLoginTime(user);
    }

    // 注册增加用户
    @Override
    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public Integer queryNameOrEmail(String username, String email) {
        return userMapper.selectNameOrEmail(username,email);
    }

}
