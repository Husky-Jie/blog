package com.husky.mapper;

import com.husky.entity.Link;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 15:12
 */
public interface LinkMapper {

    // 查询所有链接
    List<Link> selectLink();

    // 根据id回显编辑链接
    Link selectLinkId(Integer id);

    // 根据id编辑链接
    int updateLinkId(Link link);

    // 根据id删除链接
    int deleteLinkId(Integer id);

    // 添加链接
    int insertLink(Link link);
}
