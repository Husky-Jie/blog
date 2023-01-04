package com.husky.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 14:48
 */
@Controller
@RequestMapping("/admin")
public class NoticeController {

    @RequestMapping("/notice/insert")
    public String noticeInsert(){
        return "Notice/insert";
    }

    @RequestMapping("/notice")
    public String notice(){
        return "Notice/index";
    }
}
