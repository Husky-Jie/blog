package com.husky.controller;

import com.husky.common.R;
import com.husky.entity.User;
import com.husky.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/17
 * Time: 16:56
 */
@Controller
public class RegisterController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/registerSubmit", method = RequestMethod.POST)
    @ResponseBody
    public R<String> registerSubmit(@RequestParam String username, @RequestParam String nickname,
                                    @RequestParam String email, @RequestParam  String password) {
        // 判断用户名或邮箱是否存在
        Integer i = userService.queryNameOrEmail(username, email);
        if (i != null && i > 0)  {
            return R.error("用户名或邮箱已存在");
        }else {
            // 不存在，则添加用户
            User user = new User();
            user.setUserName(username);
            user.setUserPass(password);
            user.setUserNickname(nickname);
            user.setUserEmail(email);
            user.setUserAvatar("/img/avatar/avatar.png");
            user.setUserRegisterTime(new Date());
            user.setUserRole("user");
            user.setUserStatus(1);
            userService.addUser(user);
        }
        return R.success("新增账号成功");
    }
}
