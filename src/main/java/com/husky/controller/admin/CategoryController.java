package com.husky.controller.admin;

import com.husky.entity.Category;
import com.husky.service.ArticleCategoryRefService;
import com.husky.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
 * Time: 14:46
 */
@Controller
@RequestMapping("/admin")
public class CategoryController {

    @Resource
    private CategoryService categoryService;
    @Resource
    private ArticleCategoryRefService articleCategoryRefService;

    @RequestMapping("/category")
    public String category(HttpSession session){
        List<Category> categoryList = categoryService.queryCategory();
        categoryList = categoryList.stream().map((item)->{
            Integer integer = articleCategoryRefService.queryCountArticleCategoryId(item.getCategoryId());
            item.setArticleCount(integer);
            return item;
        }).collect(Collectors.toList());
        session.setAttribute("categoryList", categoryList);
        return "Category/index";
    }
    @RequestMapping("/category/insert")
    public String categoryInsert(){
        return "Category/edit";
    }

    @RequestMapping(value = "/category/insertSubmit", method = RequestMethod.POST)
    public String categoryInsertSubmit(Category category){
        category.setCategoryOrder(1);
        categoryService.addCategory(category);
        return "redirect:/admin/category";
    }

    @RequestMapping("/category/edit/{id}")
    public String categoryEdit(@PathVariable Integer id, HttpSession session){
        Category category = categoryService.queryCategoryId(id);
        session.setAttribute("category", category);
        return "Category/edit";
    }

    @RequestMapping(value = "/category/editSubmit", method = RequestMethod.POST)
    public String categoryEditSubmit(Category category){
        categoryService.putCategoryId(category);
        return "redirect:/admin/category";
    }

    @RequestMapping("/category/delete/{id}")
    public String categoryDelete(@PathVariable Integer id){
        categoryService.removeCategoryId(id);
        return "redirect:/admin/category";
    }
}
