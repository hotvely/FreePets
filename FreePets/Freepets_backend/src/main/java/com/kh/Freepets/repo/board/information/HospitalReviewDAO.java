package com.kh.Freepets.repo.board.information;

import com.kh.Freepets.domain.board.information.HospitalReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HospitalReviewDAO extends JpaRepository<HospitalReview, Integer> {

    @Query(value = "UPDATE HOSPITAL_REVIEW SET HOSPITAL_REVIEW_LIKE = HOSPITAL_REVIEW_LIKE + 1 WHERE HOSPITAL_REVIEW_CODE = :hospitalReviewCode", nativeQuery = true)
    HospitalReview updateLike(int hospitalReviewCode);

    @Query(value = "UPDATE HOSPITAL_REVIEW SET HOSPITAL_REVIEW_LIKE = HOSPITAL_REVIEW_VIEWS + 1 WHERE HOSPITAL_REVIEW_CODE = :hospitalReviewCode", nativeQuery = true)
    HospitalReview updateViews(int hospitalReviewCode);

    @Query(value = "SELETE * FROM HOSPITAL_REVIEW ORDER BY HOSPITAL_REVIEW_LIKE", nativeQuery = true)
    List<HospitalReview> showLike();

    @Query(value = "UPDATE HOSPITAL_REVIEW SET HOSPITAL_REVIEW_LIKE = HOSPITAL_REVIEW_COMMENT_COUNT + 1 WHERE HOSPITAL_REVIEW_CODE = :hospitalReviewCode", nativeQuery = true)
    HospitalReview updateCommentCount(int hospitalReviewCode);

    @Query(value = "SELETE * FROM HOSPITAL_REVIEW ORDER BY HOSPITAL_REVIEW_COMMENT_COUNT", nativeQuery = true)
    List<HospitalReview> showComment();
}
