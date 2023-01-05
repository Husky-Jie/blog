package com.husky.service;

import com.husky.entity.Tag;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 10:18
 */
public interface TagService {

    // 查询所有标签
    List<Tag> queryTag();

    // 添加标签
    Integer addTag(Tag tag);

    // 根据id回显编辑标签
    Tag queryTagId(Integer id);

    // 根据id修改标签
    Integer putTagId(Tag tag);

    // 根据id删除标签
    Integer removeTagId(Integer id);
}
