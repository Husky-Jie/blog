package com.husky.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 14:47
 */
@Controller
@RequestMapping("/admin")
public class LinkController {
    @RequestMapping("/link")
    public String link(){
        return "Link/index";
    }

    @RequestMapping("/link/insert")
    public String linkInsert(){
        return "Link/insert";
    }
}
