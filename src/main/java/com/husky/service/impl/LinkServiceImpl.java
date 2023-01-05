package com.husky.service.impl;

import com.husky.entity.Link;
import com.husky.mapper.LinkMapper;
import com.husky.service.LinkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 15:18
 */
@Service
public class LinkServiceImpl implements LinkService {

    @Resource
    private LinkMapper linkMapper;

    @Override
    public List<Link> queryLink() {
        return linkMapper.selectLink();
    }

    @Override
    public Link queryLinkId(Integer id) {
        return linkMapper.selectLinkId(id);
    }

    @Override
    public int putLinkId(Link link) {
        return linkMapper.updateLinkId(link);
    }

    @Override
    public int removeLinkId(Integer id) {
        return linkMapper.deleteLinkId(id);
    }

    @Override
    public int addLink(Link link) {
        return linkMapper.insertLink(link);
    }
}
