package com.husky.service.impl;

import com.husky.entity.Tag;
import com.husky.mapper.TagMapper;
import com.husky.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 10:18
 */
@Service
public class TagServiceImpl implements TagService {

    @Resource
    private TagMapper tagMapper;

    @Override
    public List<Tag> queryTag() {
        return tagMapper.selectTag();
    }

    @Override
    public Integer addTag(Tag tag) {
        return tagMapper.insertTag(tag);
    }

    @Override
    public Tag queryTagId(Integer id) {
        return tagMapper.selectTagId(id);
    }

    @Override
    public Integer putTagId(Tag tag) {
        return tagMapper.updateTagId(tag);
    }

    @Override
    public Integer removeTagId(Integer id) {
        return tagMapper.deleteTagId(id);
    }
}
