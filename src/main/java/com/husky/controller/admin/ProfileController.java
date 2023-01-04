package com.husky.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 14:52
 */
@Controller
@RequestMapping("/admin")
public class ProfileController {
    @RequestMapping("/profile")
    public String profile(){
        return "User/profile";
    }

    @RequestMapping("/profile/edit")
    public String profileEdit(){
        return "User/edit";
    }
}
