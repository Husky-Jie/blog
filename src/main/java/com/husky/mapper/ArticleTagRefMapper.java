package com.husky.mapper;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 10:22
 */
public interface ArticleTagRefMapper {

    // 查询标签id下的文章数量
    Integer selectArticleTagCount(Integer id);
}
