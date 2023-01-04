package com.husky.mapper;

import com.husky.entity.Category;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 15:13
 */
public interface CategoryMapper {

    // 查询所有分类
    List<Category> selectCategory();

    // 添加分类
    Integer insertCategory(Category category);

    // 根据id查询分类
    Category selectCategoryId(Integer id);

    // 编辑分类
    Integer updateCategoryId(Category category);

    // 根据id删除分类
    Integer deleteCategoryId(Integer id);
}
