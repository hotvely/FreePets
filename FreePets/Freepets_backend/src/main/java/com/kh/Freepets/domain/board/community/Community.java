package com.kh.Freepets.domain.board.community;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import java.util.Date;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Community {
    @Id
    @Column(name="common_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "commonSeq")
    @SequenceGenerator(name = "commonSeq", sequenceName = "SEQ_COMMON",allocationSize = 1)
    private int commonCode;
    @Column(name="common_date")
    private Date commonDate;
    @Column(name="common_views")
    private int commonViews;
    @Column(name="common_title")
    private String commonTitle;
    @Column(name="common_desc")
    private String commonDesc;
    @Column(name="common_add_file_url")
    private String commonAddFileUrl;
    @Column(name="common_youtube_url")
    private String youtubeUrl;

    @ManyToOne
    @JoinColumn(name="id")
    private Member member;
    //신고 만들어줘 예진아

}
