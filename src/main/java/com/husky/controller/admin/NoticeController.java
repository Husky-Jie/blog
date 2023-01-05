package com.husky.controller.admin;

import com.husky.entity.Notice;
import com.husky.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2023/1/4
 * Time: 14:48
 */
@Controller
@RequestMapping("/admin/notice")
public class NoticeController {

    @Resource
    private NoticeService noticeService;

    @RequestMapping("/insert")
    public String noticeInsert(){
        return "Notice/insert";
    }

    @RequestMapping
    public String notice(HttpSession session){
        List<Notice> noticeList = noticeService.queryNotice();
        session.setAttribute("noticeList", noticeList);
        return "Notice/index";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, HttpSession session){
        Notice notice = noticeService.queryNoticeId(id);
        session.setAttribute("notice", notice);
        return "Notice/edit";
    }

    @RequestMapping(value = "/editSubmit", method = RequestMethod.POST)
    public String editSubmit(Notice notice) {
        notice.setNoticeUpdateTime(new Date());
        noticeService.putNotice(notice);
        return "redirect:/admin/notice";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        noticeService.removeNoticeId(id);
        return "redirect:/admin/notice";
    }

    @RequestMapping(value = "/insertSubmit", method = RequestMethod.POST)
    public String insertSubmit(Notice notice){
        notice.setNoticeUpdateTime(new Date());
        notice.setNoticeCreateTime(new Date());
        notice.setNoticeStatus(1);
        noticeService.addNotice(notice);
        return "redirect:/admin/notice";
    }
}
