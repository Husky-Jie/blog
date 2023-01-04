package com.husky.service;

import com.husky.entity.Category;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 15:17
 */
public interface CategoryService {
    // 查询所有分类
    List<Category> queryCategory();

    // 添加分类
    Integer addCategory(Category category);

    // 根据id查询分类
    Category queryCategoryId(Integer id);

    // 编辑分类
    Integer putCategoryId(Category category);

    // 根据id删除分类
    Integer removeCategoryId(Integer id);
}
