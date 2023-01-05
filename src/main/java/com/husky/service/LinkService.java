package com.husky.service;

import com.husky.entity.Link;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 15:16
 */
public interface LinkService {

    // 查询所有链接
    List<Link> queryLink();

    // 根据id回显编辑链接
    Link queryLinkId(Integer id);

    // 根据id编辑链接
    int putLinkId(Link link);

    // 根据id删除链接
    int removeLinkId(Integer id);

    // 添加链接
    int addLink(Link link);
}
