package com.husky.mapper;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/29
 * Time: 15:06
 */
public interface ArticleMapper{

    // 根据用户id查询文章总数
    Integer selectArticleCount(Integer userId);
}
