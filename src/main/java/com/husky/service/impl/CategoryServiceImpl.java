package com.husky.service.impl;

import com.husky.entity.Category;
import com.husky.mapper.CategoryMapper;
import com.husky.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 15:18
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryCategory() {
        return categoryMapper.selectCategory();
    }

    @Override
    public Integer addCategory(Category category) {
        return categoryMapper.insertCategory(category);
    }

    @Override
    public Category queryCategoryId(Integer id) {
        return categoryMapper.selectCategoryId(id);
    }

    @Override
    public Integer putCategoryId(Category category) {
        return categoryMapper.updateCategoryId(category);
    }

    @Override
    public Integer removeCategoryId(Integer id) {
        return categoryMapper.deleteCategoryId(id);
    }
}
