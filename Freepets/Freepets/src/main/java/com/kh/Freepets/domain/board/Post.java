package com.kh.Freepets.domain.board;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post
{
    // common variable
    @Id
    private int post_id;

    @Column
    private String title;
    @Column
    private String content;
    @Column
    private Date regDate;
    @Column
    private int views;
    @Column
    private int likes;

    // entity connect
    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    // Member entity와 연결할 수 있는 id값;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;


}
