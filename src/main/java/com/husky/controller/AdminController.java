package com.husky.controller;

import com.husky.common.R;
import com.husky.dto.UserDto;
import com.husky.entity.User;
import com.husky.service.ArticleService;
import com.husky.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.stream.Collectors;

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
    @Resource
    private ArticleService articleService;

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
    public String user(HttpSession session){
        // 根据用户类型查询用户，显示全部用户
        List<User> userList = userService.queryUserRole();
        // 添加每个用户的文章数量
        List<UserDto> dtoList = userList.stream().map((item) -> {
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(item, dto);
            Integer articleCount = articleService.queryArticleCount(item.getUserId());
            dto.setArticleCount(articleCount);
            return dto;
        }).collect(Collectors.toList());
        session.setAttribute("userList",dtoList);
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

    @RequestMapping("/user/edit/{id}")
    public String userEdit(@PathVariable Integer id, HttpSession session){
        // 编辑用户的回显用户信息
        User user = userService.queryIdUser(id);
        session.setAttribute("user",user);
        return "User/edit";
    }

    @RequestMapping("/user/delete/{id}")
    public String userDelete(@PathVariable Integer id){
        // 根据id删除用户
        userService.removeIdUser(id);
        return "redirect:/admin/user";
    }
}
