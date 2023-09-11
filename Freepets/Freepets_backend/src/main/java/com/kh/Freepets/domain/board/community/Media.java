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
public class Media {

    @Id
    @Column(name="media_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "mediaSeq")
    @SequenceGenerator(name = "mediaSeq", sequenceName = "SEQ_MEDIA", allocationSize = 1)
    private int mediaCode;

    @Column(name="media_title")
    private String mediaTitle;
    @Column(name="media_date")
    private Date mediaDate;
    @Column(name="media_views")
    private int mediaViews;
    @Column(name="meida_add_file_url")
    private String mediaAddFileUrl;
    @Column(name="media_youtube_url")
    private String youtubeUrl;
    @Column(name="media_desc")
    private String mediaDesc;
    @Column(name="media_photo")
    private String mediaPhoto;
    @Column(name="media_category")
    private String category;

    @ManyToOne
    @JoinColumn(name="id")
    private Member member;
    //private Report report; 신고 뉘기야


}
