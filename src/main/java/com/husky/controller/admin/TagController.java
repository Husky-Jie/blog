package com.husky.controller.admin;

import com.husky.entity.Tag;
import com.husky.service.ArticleTagRefService;
import com.husky.service.TagService;
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
 * Date: 2023/1/4
 * Time: 14:45
 */
@Controller
@RequestMapping("/admin")
public class TagController {

    @Resource
    private TagService tagService;

    @Resource
    private ArticleTagRefService articleTagRefService;

    @RequestMapping("/tag")
    public String tag(HttpSession session){
        List<Tag> tagList = tagService.queryTag();
        tagList = tagList.stream().map((item)->{
            Integer integer = articleTagRefService.queryArticleTagCount(item.getTagId());
            item.setArticleCount(integer);
            return item;
        }).collect(Collectors.toList());
        session.setAttribute("tagList", tagList);
        return "Tag/index";
    }

    @RequestMapping(value = "/tag/insertSubmit", method = RequestMethod.POST)
    public String tagInsertSubmit(Tag tag){
        tagService.addTag(tag);
        return "redirect:/admin/tag";
    }

    @RequestMapping("/tag/edit/{id}")
    public String tagEdit(@PathVariable Integer id, HttpSession session){
        Tag tag = tagService.queryTagId(id);
        session.setAttribute("tag", tag);
        return "Tag/edit";
    }

    @RequestMapping(value = "/tag/editSubmit", method = RequestMethod.POST)
    public String tagEditSubmit(Tag tag){
        tagService.putTagId(tag);
        return "redirect:/admin/tag";
    }

    @RequestMapping("/tag/delete/{id}")
    public String tagDelete(@PathVariable Integer id){
        tagService.removeTagId(id);
        return "redirect:/admin/tag";
    }
}
