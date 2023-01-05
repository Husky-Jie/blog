package com.husky.service.impl;

import com.husky.mapper.ArticleTagRefMapper;
import com.husky.service.ArticleTagRefService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 10:27
 */
@Service
public class ArticleTagRefServiceImpl implements ArticleTagRefService {

    @Resource
    private ArticleTagRefMapper articleTagRefMapper;

    @Override
    public Integer queryArticleTagCount(Integer id) {
        return articleTagRefMapper.selectArticleTagCount(id);
    }
}
