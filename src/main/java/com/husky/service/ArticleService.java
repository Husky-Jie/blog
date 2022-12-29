package com.husky.service;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/29
 * Time: 15:08
 */
public interface ArticleService {
    // 根据用户id查询文章总数
    Integer queryArticleCount(Integer userId);
}
