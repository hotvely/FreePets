package com.kh.Freepets.domain.board;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report
{
    // 여러번 신고 하지 못하도록 막는 기능;
    private boolean canReport = true;

    // 현재 신고한 사람의 정보를 서버로 넘기기 위한 데이터
    private int member_id;

    // 신고한 시간
    private Date date;

    // 신고당한 게시글이나 댓글
    private Comment comment;
    private Post post;

}
