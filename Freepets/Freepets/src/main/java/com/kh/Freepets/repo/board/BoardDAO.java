package com.kh.Freepets.repo.board;

import com.kh.Freepets.domain.board.Board;
import com.kh.Freepets.domain.board.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardDAO extends JpaRepository<Board, Integer>
{
    @Query(value = "SELECT * FROM post WHERE board_id = :board_id", nativeQuery = true)
    List<Post> findByBoardId(int board_id);
}
