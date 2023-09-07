package com.kh.Freepets.domain.board;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post
{
    // common variable
    private int post_id;
    private String title;
    private String content;
    private Date Date;
    private int view;
    private int like;

    // entity connect
    private int board_id;
    // Member entity와 연결할 수 있는 id값;
    private int member_id;


}
