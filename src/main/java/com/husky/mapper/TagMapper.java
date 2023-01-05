package com.husky.mapper;

import com.husky.entity.Tag;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 10:15
 */
public interface TagMapper {

    // 查询所有标签
    List<Tag> selectTag();

    // 添加标签
    Integer insertTag(Tag tag);

    // 根据id回显编辑标签
    Tag selectTagId(Integer id);

    // 根据id修改标签
    Integer updateTagId(Tag tag);

    // 根据id删除标签
    Integer deleteTagId(Integer id);
}
