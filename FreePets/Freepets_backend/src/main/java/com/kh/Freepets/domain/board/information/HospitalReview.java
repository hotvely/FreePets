package com.kh.Freepets.domain.board.information;

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
public class HospitalReview {
    @Id
    @Column(name = "hospital_review_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "hospitalReviewSequence")
    @SequenceGenerator(name = "hospitalReviewSequence", sequenceName = "SEQ_HOSPITAL_REVIEW", allocationSize = 1)
    private int hospitalReviewCode;

    @Column(name = "hospital_review_views")
    private int hospitalReviewViews;

    @Column(name = "hospital_review_date")
    private Date hospitalReviewDate;

    @Column(name = "hospital_review_title")
    private String hospitalReviewTitle;

    @Column(name = "hospital_review_desc")
    private String hospitalReviewDesc;

    @Column(name = "hospital_review_img")
    private String hospitalReviewImg;

    @Column(name = "hospital_review_like")
    private int hospitalReviewLike;

    @Column(name = "hospital_review_comment_count")
    private int hospitalReviewCommentCount;

    @Column(name = "hospital_review_report_yn")
    private char hospitalReviewReportYn;

    @ManyToOne
    @JoinColumn(name = "id")
    private Member member;
}
