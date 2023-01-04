package com.husky.controller.admin;

import com.husky.entity.Page;
import com.husky.service.PageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 14:38
 */
@Controller
@RequestMapping("/admin")
public class PageController {
    @Resource
    private PageService pageService;

    @RequestMapping("/page/insert")
    public String pageInsert(){
        return "Page/insert";
    }

    @RequestMapping("/page")
    public String page(HttpSession session){
        List<Page> pageList = pageService.queryAllPage();
        session.setAttribute("pageList", pageList);
        return "Page/index";
    }

    @RequestMapping("/page/edit/{id}")
    public String pageEdit(@PathVariable Integer id, HttpSession session){
        Page page = pageService.queryIdPage(id);
        session.setAttribute("page", page);
        return "Page/edit";
    }

    @RequestMapping(value = "/page/editSubmit", method = RequestMethod.POST)
    public String pageEditSubmit(Page page) {
        page.setPageUpdateTime(new Date());
        pageService.putIdPage(page);
        return "redirect:/admin/page";
    }

    @RequestMapping(value = "/page/insertSubmit", method = RequestMethod.POST)
    public String pageInsertSubmit(Page page) {
        page.setPageCreateTime(new Date());
        page.setPageStatus(1);
        pageService.addPage(page);
        return "redirect:/admin/page";
    }

    @RequestMapping("/page/delete/{id}")
    public String pageDelete(@PathVariable Integer id){
        pageService.removeIdPage(id);
        return "redirect:/admin/page";
    }
}
