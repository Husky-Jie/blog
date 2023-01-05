package com.husky.service;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 10:27
 */
public interface ArticleTagRefService {
    // 查询标签id下的文章数量
    Integer queryArticleTagCount(Integer id);
}
