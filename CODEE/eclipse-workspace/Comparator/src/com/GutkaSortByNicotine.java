package com;

import java.util.Comparator;

public class GutkaSortByNicotine implements Comparator<Gutka> {
	public int compare(Gutka x, Gutka y) {
//		return Double.compare(x.nicotine, y.nicotine);
		return x.nicotine.compareTo(y.nicotine);
	}
	

}
