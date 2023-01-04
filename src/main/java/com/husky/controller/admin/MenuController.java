package com.husky.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 14:50
 */
@Controller
@RequestMapping("/admin")
public class MenuController {

    @RequestMapping("/menu")
    public String menu(){
        return "Menu/index";
    }
}
