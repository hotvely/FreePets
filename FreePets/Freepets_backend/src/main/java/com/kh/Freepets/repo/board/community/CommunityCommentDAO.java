package com.kh.Freepets.repo.board.community;

import com.kh.Freepets.domain.board.community.CommunityComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityCommentDAO extends JpaRepository<CommunityComment, Integer> {
}
