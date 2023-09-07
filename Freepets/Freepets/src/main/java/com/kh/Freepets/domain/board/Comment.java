package com.kh.Freepets.domain.board;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment
{
    private int id;
    private String content;
    private Date date;

    // 댓글 작성자를 조회 할 수 있는 회원아이디값;
    private int member_id;


    // 댓글에 다시 댓글을 달 수 있으므로...?
    private Comment recomment;
}
