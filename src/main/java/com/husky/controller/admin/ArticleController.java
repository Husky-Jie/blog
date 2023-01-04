package com.husky.controller.admin;

import com.husky.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 14:41
 */
@Controller
@RequestMapping("/admin")
public class ArticleController {
    @Resource
    private ArticleService articleService;


    @RequestMapping("/article")
    public String article(){
        return "Article/index";
    }

    @RequestMapping("/article/insert")
    public String articleInsert(){
        return "Article/insert";
    }
}
