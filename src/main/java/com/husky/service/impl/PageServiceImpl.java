package com.husky.service.impl;

import com.husky.entity.Page;
import com.husky.mapper.PageMapper;
import com.husky.service.PageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 11:52
 */
@Service
public class PageServiceImpl implements PageService {
    @Resource
    private PageMapper pageMapper;

    @Override
    public List<Page> queryAllPage() {
        return pageMapper.selectAllPage();
    }

    @Override
    public Page queryIdPage(Integer id) {
        return pageMapper.selectIdPage(id);
    }

    @Override
    public Integer putIdPage(Page page) {
        return pageMapper.updateIdPage(page);
    }

    @Override
    public Integer addPage(Page page) {
        return pageMapper.insertPage(page);
    }

    @Override
    public Integer removeIdPage(Integer id) {
        return pageMapper.deleteIdPage(id);
    }
}
