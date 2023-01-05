package com.husky.mapper;

import com.husky.entity.Notice;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 16:27
 */
public interface NoticeMapper {

    // 查询所有公告
    List<Notice> selectNotice();

    // 根据id回显编辑公告
    Notice selectNoticeId(Integer id);

    // 保存编辑公告
    int updateNotice(Notice notice);

    // 根据id删除公告
    int deleteNoticeId(Integer id);

    // 添加公告
    int insertNotice(Notice notice);
}
