package com.husky.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 14:46
 */
@Controller
@RequestMapping("/admin")
public class CategoryController {

    @RequestMapping("/category/insert")
    public String categoryInsert(){
        return "Category/edit";
    }

    @RequestMapping("/category")
    public String category(){
        return "Category/index";
    }
}
