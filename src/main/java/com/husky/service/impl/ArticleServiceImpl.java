package com.husky.service.impl;

import com.husky.mapper.ArticleMapper;
import com.husky.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/29
 * Time: 15:09
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;
    @Override
    public Integer queryArticleCount(Integer userId) {
        return articleMapper.selectArticleCount(userId);
    }
}
