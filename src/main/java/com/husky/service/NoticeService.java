package com.husky.service;

import com.husky.entity.Notice;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 16:35
 */
public interface NoticeService {

    // 查询所有公告
    List<Notice> queryNotice();

    // 根据id回显编辑公告
    Notice queryNoticeId(Integer id);

    // 保存编辑公告
    int putNotice(Notice notice);

    // 根据id删除公告
    int removeNoticeId(Integer id);

    // 添加公告
    int addNotice(Notice notice);
}
