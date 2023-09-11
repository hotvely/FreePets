package com.kh.home.board.market.compare;

import java.util.Comparator;

import com.kh.home.board.market.model.Product;

public class PriceOrder implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPrice() > o1.getPrice() ? -1 : o1.getPrice() < o2.getPrice() ? 1 : 0;
	}


}
