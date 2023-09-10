package com.kh.Freepets.repo.board.information;

import com.kh.Freepets.domain.board.information.PRComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PRCommentDAO extends JpaRepository<PRComment, Integer> {
}
