package com.kh.Freepets.domain.board.notice;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.EmbeddableInstantiator;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@Entity
public class Notice {

    @Id
    @Column(name = "notice_code")
    private int noticeCode;

    @Column(name = "notice_title")
    private String noticeTitle;

    @Column(name = "notice_contents")
    private String noticeContents;

    @Column(name = "notice_views")
    private int noticeViews;

    @Column(name = "notice_date")
    private Date noticeDate;

    @Column(name = "id")
    private Member member;



}
