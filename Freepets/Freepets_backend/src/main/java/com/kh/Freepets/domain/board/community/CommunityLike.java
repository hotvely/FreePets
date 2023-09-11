package com.kh.Freepets.domain.board.community;

import com.kh.Freepets.domain.member.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CommunityLike {
    @Id
    @Column(name="c_like_code")
    private int commonLike;

    @ManyToOne
    @JoinColumn(name="common_code")
    private Community community;
    @ManyToOne
    @JoinColumn(name="id")
    private Member member;
}
