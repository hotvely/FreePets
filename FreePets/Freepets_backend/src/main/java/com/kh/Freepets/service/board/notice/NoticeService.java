package com.kh.Freepets.service.board.notice;

import com.kh.Freepets.domain.board.notice.Notice;
import com.kh.Freepets.repo.board.notice.NoticeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService
{
    @Autowired
    private NoticeDAO dao;

    public List<Notice> showNoticeAll(int noticeCode){
        return dao.showNoticeAll(noticeCode);
    }

    public Notice update(Notice notice){
        Notice target = NoticeDAO.findById(notice.getNoticeCode()).orElse(null);
        if(target!=null) {
            return dao.save(notice);
        }
        return null;
    }
    public Notice delete(int id){
        Notice target = dao.findById(id).orElse(null);
        dao.delete(target);
        return target;
    }
    public Notice create(Notice notice){
        return dao.save(notice);
    }
}
