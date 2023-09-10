package com.kh.Freepets.repo.board.information;

import com.kh.Freepets.domain.board.information.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewDAO extends JpaRepository<ProductReview, Integer> {
}
