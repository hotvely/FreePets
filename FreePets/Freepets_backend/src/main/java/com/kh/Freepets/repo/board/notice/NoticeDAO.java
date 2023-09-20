package com.kh.Freepets.repo.board.notice;


import com.kh.Freepets.domain.board.notice.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeDAO extends JpaRepository<Notice, Integer>
{
    @Query(value = "SELECT * FROM notice WHERE notice_code = :code", nativeQuery = true)
    List<Notice> showNoticeAll(int noticeCode);


}
