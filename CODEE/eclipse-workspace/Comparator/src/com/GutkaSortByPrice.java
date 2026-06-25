package com;

import java.util.Comparator;

public class GutkaSortByPrice implements Comparator<Gutka>{
	@Override
	public int compare(Gutka x, Gutka y) {
		return x.price-y.price;
	}

}
