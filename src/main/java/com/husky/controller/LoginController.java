package com.husky.controller;

import com.husky.common.R;
import com.husky.entity.User;
import com.husky.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.Date;

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
    @ResponseBody
    public R<User> loginVerify(@RequestParam String username, @RequestParam String password, HttpSession session){
        User user = userService.queryUser(username);
        if (user == null){
            return R.error("该用户不存在");
        }else {
            if (!password.equals(user.getUserPass())){
                return R.error("密码错误");
            }else if (user.getUserStatus()==0){
                return R.error("该用户已被禁用");
            }else{
                session.setAttribute("user",user);
                user.setUserLastLoginTime(new Date());
                userService.PutUploadLoginTime(user);
                System.out.println(new Date());
            }
        }
        return R.success(user);
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(){
        return "index";
    }
}
