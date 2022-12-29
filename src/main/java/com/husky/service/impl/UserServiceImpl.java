package com.husky.service.impl;

import com.husky.dto.UserDto;
import com.husky.entity.User;
import com.husky.mapper.UserMapper;
import com.husky.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    // 用户修改
    @Override
    public int PutUser(User user) {
        return userMapper.UpdateUser(user);
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

    // 根据角色查询用户
    @Override
    public List<User> queryUserRole() {
        return userMapper.selectUserRole();
    }
    // 根据id查询用户
    @Override
    public User queryIdUser(Integer id) {
        return userMapper.selectIdUser(id);
    }

    @Override
    public int removeIdUser(Integer id) {
        return userMapper.deleteIdUser(id);
    }

}
