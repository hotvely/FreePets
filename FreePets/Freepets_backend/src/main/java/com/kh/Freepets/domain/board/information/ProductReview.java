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
public class ProductReview {

    @Id
    @Column(name = "product_review_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "productReivewSequence")
    @SequenceGenerator(name = "productReivewSequence", sequenceName = "SEQ_PRODUCT_REIVEW", allocationSize = 1)
    private int productReviewCode;

    @Column(name = "product_review_date")
    private Date productReviewDate;

    @Column(name = "product_review_thum")
    private String productReviewThum;

    @Column(name = "product_review_title")
    private String productReviewTitle;

    @Column(name = "product_review_views")
    private int productReivewViews;

    @Column(name = "product_review_desc")
    private String productReivewDesc;

    @Column(name = "product_review_img")
    private String productReviewImg;

    @Column(name = "product_review_like")
    private String productReviewLike;

    @Column(name = "product_review_report_yn")
    private char productReviewReportYn;

    @ManyToOne
    @JoinColumn(name = "id")
    private Member member;
}
