package com.husky.mapper;

import com.husky.entity.Page;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 11:47
 */
public interface PageMapper {
    // 查询所有页面
    List<Page> selectAllPage();

    // 通过id查询页面
    Page selectIdPage(Integer id);

    // 修改页面
    Integer updateIdPage(Page page);

    // 添加页面
    Integer insertPage(Page page);

    // 根据id删除页面
    Integer deleteIdPage(Integer id);
}
