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

    @Override
    public User queryUser(String userOrEmail) {
        return userMapper.selectUser(userOrEmail);
    }
}
