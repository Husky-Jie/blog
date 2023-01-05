package com.husky.service.impl;

import com.husky.entity.Notice;
import com.husky.mapper.NoticeMapper;
import com.husky.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/5
 * Time: 16:36
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Resource
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> queryNotice() {
        return noticeMapper.selectNotice();
    }

    @Override
    public Notice queryNoticeId(Integer id) {
        return noticeMapper.selectNoticeId(id);
    }

    @Override
    public int putNotice(Notice notice) {
        return noticeMapper.updateNotice(notice);
    }

    @Override
    public int removeNoticeId(Integer id) {
        return noticeMapper.deleteNoticeId(id);
    }

    @Override
    public int addNotice(Notice notice) {
        return noticeMapper.insertNotice(notice);
    }
}
