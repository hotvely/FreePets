package com.kh.Freepets.domain.board.community;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;


import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Lost {
    @Id
    @Column(name="lost_code")
    private int lostCode;

    @Column
    private String nickname;
    @Column(name="lost_title")
    private String lostTitle;
    @Column(name="lost_date")
    private Date lostDate;
    @Column(name="lost_views")
    private int lostViews;
    @Column(name="lost_desc")
    private String lostDesc;
    @Column(name="lost_report_yn")
    private char lostReportYN;
    @Column(name="lost_like")
    private int lostLike;

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;
}
