package com.kh.Freepets.repo.board.information;

import com.kh.Freepets.domain.board.information.HRComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HRCommentDAO extends JpaRepository<HRComment, Integer> {
}
