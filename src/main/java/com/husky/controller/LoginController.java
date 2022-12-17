package com.husky.controller;

import com.husky.common.R;
import com.husky.entity.User;
import com.husky.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/17
 * Time: 16:17
 */
@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("/LoginForward")
    public String LoginForward(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String LoginReturn(){
        return "login";
    }

    @RequestMapping("/loginVerify")
    public R<String> loginVerify(String userOrEmail, String password, String rememberme){
        User user = userService.queryUser(userOrEmail);
        if (user == null){
            return R.error("该用户不存在");
        }else {

        }
        return null;
    }
}
