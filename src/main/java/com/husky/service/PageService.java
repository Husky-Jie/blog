package com.husky.service;

import com.husky.entity.Page;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 11:52
 */
public interface PageService {
    // 查询所有页面
    List<Page> queryAllPage();

    // 通过id查询页面
    Page queryIdPage(Integer id);

    // 修改页面
    Integer putIdPage(Page page);

    // 添加页面
    Integer addPage(Page page);

    // 根据id删除页面
    Integer removeIdPage(Integer id);
}
