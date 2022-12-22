package com.husky.controller;

import com.husky.entity.User;
import com.husky.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/19
 * Time: 23:01
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private UserService userService;

    // 退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        // 移除session
        session.removeAttribute("user");
        return "login";
    }

    @RequestMapping(value = "/user/editSubmit", method = RequestMethod.POST)
    public String editSubmit(User user){
        userService.PutUser(user);
        return "redirect:/admin/user";
    }

    /*
    * 以下均为页面跳转*/
    @RequestMapping("/article/insert")
    public String articleInsert(){
        return "Article/insert";
    }

    @RequestMapping("/page/insert")
    public String pageInsert(){
        return "Page/insert";
    }

    @RequestMapping("/category/insert")
    public String categoryInsert(){
        return "Category/edit";
    }

    @RequestMapping("/notice/insert")
    public String noticeInsert(){
        return "Notice/insert";
    }

    @RequestMapping("/link/insert")
    public String linkInsert(){
        return "Link/insert";
    }

    @RequestMapping("/article")
    public String article(){
        return "Article/index";
    }

    @RequestMapping("/page")
    public String page(){
        return "Page/index";
    }

    @RequestMapping("/category")
    public String category(){
        return "Category/index";
    }

    @RequestMapping("/notice")
    public String notice(){
        return "Notice/index";
    }

    @RequestMapping("/link")
    public String link(){
        return "Link/index";
    }

    @RequestMapping("/comment/receive")
    public String commentReceive(){
        return "Comment/edit";
    }

    @RequestMapping("/comment")
    public String comment(){
        return "Comment/index";
    }

    @RequestMapping("/user/insert")
    public String userInsert(){
        return "User/insert";
    }

    @RequestMapping("/user")
    public String user(){
        return "User/index";
    }

    @RequestMapping("/tag")
    public String tag(){
        return "Tag/index";
    }

    @RequestMapping("/menu")
    public String menu(){
        return "Menu/index";
    }

    @RequestMapping("/options")
    public String mOptions(){
        return "Options/index";
    }

    @RequestMapping("/profile")
    public String profile(){
        return "User/profile";
    }

    @RequestMapping("/profile/edit")
    public String profileEdit(){
        return "User/edit";
    }
}
