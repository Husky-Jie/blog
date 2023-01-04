package com.husky.service.impl;

import com.husky.mapper.ArticleCategoryRefMapper;
import com.husky.service.ArticleCategoryRefService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 16:05
 */
@Service
public class ArticleCategoryRefServiceImpl implements ArticleCategoryRefService {

    @Resource
    private ArticleCategoryRefMapper articleCategoryRefMapper;

    @Override
    public Integer queryCountArticleCategoryId(Integer id) {
        return articleCategoryRefMapper.selectCountArticleCategoryId(id);
    }
}
