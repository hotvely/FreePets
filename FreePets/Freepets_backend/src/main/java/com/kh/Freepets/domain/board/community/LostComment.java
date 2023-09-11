package com.kh.Freepets.domain.board.community;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LostComment {
    @Id
    @Column(name="l_comment_code")
    private int l_commentCode;

    @Column(name="l_comment_desc")
    private String l_commentDesc;
    @Column
    private String nickname;
    @Column(name="l_comment_date")
    private Date l_commentDate;
    @Column(name="l_comment_code_super")
    private int l_commentCodeSuper;
    @Column(name="l_comment_report_yn")
    private char l_commentReportYN;

    @ManyToOne
    @JoinColumn(name="lost_code")
    private Lost lost;
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;

}
