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
public class CommunityComment {
    @Id
    @Column(name="c_comment_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "commonCommentSeq")
    @SequenceGenerator(name = "commonCommentSeq", sequenceName = "SEQ_COMMON_COMMENT",allocationSize = 1)
    private int commonCommentCode;

    @Column(name="c_comment_desc")
    private String commonCommentDesc;
    @Column(name="c_comment_date")
    private Date commonCommentDate;
    @Column(name="c_comment_code_super")
    private int commonCommentCodeSuper;
    @Column(name="c_comment_add_file_url")
    private String commonCommentAddFileUrl;

    @ManyToOne
    @JoinColumn(name="common_code")
    private Community community;
    @ManyToOne
    @JoinColumn(name="id")
    private Member member;

}
