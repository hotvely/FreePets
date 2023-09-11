package com.kh.Freepets.repo.board.community;

import com.kh.Freepets.domain.board.community.Lost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.management.ValueExp;
import java.util.List;


public interface LostDAO extends JpaRepository<Lost,Integer > {
    // 특정 유저의 분실 게시물 조회 // SELECT * FROM LOST WHERE ID=?
    @Query(value="SELECT * FROM LOST WHERE ID= :id", nativeQuery = true)
    List<Lost> findByMemberId(String id);

    // 조회수별 게시물 조회
    @Query(value="SELECT * FROM LOST ORDER BY LOST_VIEWS DESC", nativeQuery = true)
    List<Lost> findAllLostViews();


    // 댓글수 별 게시물 조회



    // 좋아요 수 별 게시물 조회
    @Query(value = "SELECT * FROM LOST ORDER BY LOST_LIKES DESC ", nativeQuery = true)
    List<Lost>findAllLostLikes();

}
