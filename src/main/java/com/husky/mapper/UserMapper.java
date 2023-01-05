package com.husky.mapper;

import com.husky.dto.UserDto;
import com.husky.entity.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/17
 * Time: 18:58
 */
public interface UserMapper {

    // 根据用户名或电子邮箱查询
    User selectUser(String userOrEmail);

    // 用户修改
    int UpdateUser(User user);

    // 注册增加用户
    int insertUser(User user);

    // 查询注册的用户名或邮箱是否存在
    Integer selectNameOrEmail(String username, String email);

    // 查询用户
    List<User> selectUserRole();

    // 根据id查询用户
    User selectIdUser(Integer id);

    // 根据id删除用户
    int deleteIdUser(Integer id);

}
