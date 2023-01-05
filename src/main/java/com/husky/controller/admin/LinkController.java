package com.husky.controller.admin;

import com.husky.entity.Link;
import com.husky.service.LinkService;
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
 * Time: 14:47
 */
@Controller
@RequestMapping("/admin/link")
public class LinkController {

    @Resource
    private LinkService linkService;

    @RequestMapping
    public String link(HttpSession session){
        List<Link> linkList = linkService.queryLink();
        session.setAttribute("linkList", linkList);
        return "Link/index";
    }

    @RequestMapping("/insert")
    public String linkInsert(HttpSession session){
        List<Link> linkList = linkService.queryLink();
        session.setAttribute("linkList", linkList);
        return "Link/insert";
    }

    @RequestMapping("/edit/{id}")
    public String linkEdit(@PathVariable Integer id, HttpSession session){
        Link link = linkService.queryLinkId(id);
        session.setAttribute("linkCustom", link);
        return "Link/edit";
    }

    @RequestMapping(value = "/editSubmit", method = RequestMethod.POST)
    public String linkEditSubmit(Link link){
        link.setLinkUpdateTime(new Date());
        linkService.putLinkId(link);
        return "redirect:/admin/link";
    }

    @RequestMapping("/delete/{id}")
    public String linkDelete(@PathVariable Integer id){
        linkService.removeLinkId(id);
        return "redirect:/admin/link";
    }

    @RequestMapping(value = "/insertSubmit", method = RequestMethod.POST)
    public String linkInsertSubmit(Link link){
        link.setLinkUpdateTime(new Date());
        link.setLinkCreateTime(new Date());
        link.setLinkStatus(1);
        linkService.addLink(link);
        return "redirect:/admin/link/insert";
    }
}
