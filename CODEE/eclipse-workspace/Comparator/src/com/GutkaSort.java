package com;

import java.util.TreeSet;

public class GutkaSort {
	public static void main(String[] args) {
		
		GutkaSortByPrice gp = new GutkaSortByPrice();
		GutkaSortByName gn = new GutkaSortByName();
		GutkaSortByNicotine gnic = new GutkaSortByNicotine();
		TreeSet<Gutka> ts = new TreeSet(gnic);
		ts.add(new Gutka(25, "Vimal", 5.23));
		ts.add(new Gutka(20, "Super", 6.02));
		ts.add(new Gutka(40, "Manikchand(RMD)", 8.6));
		
		for(Gutka g : ts) {
			System.out.println(g);
		}
		
	}

}
