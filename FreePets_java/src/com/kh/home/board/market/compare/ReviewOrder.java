package com.kh.home.board.market.compare;

import java.util.Comparator;

import com.kh.home.board.market.model.Product;

public class ReviewOrder implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getReviewCount() > o2.getReviewCount() ? -1 : o1.getReviewCount() < o2.getReviewCount() ? 1 : 0;
	}

}
