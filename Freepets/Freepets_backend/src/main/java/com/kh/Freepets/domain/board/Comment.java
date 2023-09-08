package com.kh.Freepets.domain.board;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment
{
    @Id
    private int id;
    private String content;
    private Date date;

    @ManyToOne      // channel 엔티티와 member 엔티티를 다대일 관계로 설정;;;;;
    @JoinColumn(name = "id") // 외래키 생성 or Member엔티티의 기본키와 매핑
    // 댓글 작성자를 조회 할 수 있는 회원아이디값;
    private Member member_id;

    // 댓글에 다시 댓글들을 달 수 있으므로...?
    private List<Comment> recomments;
}
