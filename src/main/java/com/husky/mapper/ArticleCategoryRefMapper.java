package com.husky.mapper;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 16:00
 */
public interface ArticleCategoryRefMapper {

    // 统计分类文章的数量
    Integer selectCountArticleCategoryId(Integer id);
}
