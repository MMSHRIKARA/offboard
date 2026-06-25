package com;

import java.util.Comparator;

public class GutkaSortByName implements Comparator<Gutka>{
	
	public int compare(Gutka x, Gutka y) {
		return x.name.compareTo(y.name);
	}
	

}
