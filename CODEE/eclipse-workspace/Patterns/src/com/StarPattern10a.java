package com;

//        * 
//      *   * 
//    *       * 
//  *           * 
//*               *
public class StarPattern10a {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("  ");
			}
			System.out.print("* ");
			for(int k=2; k<=i; k++) {
				System.out.print("  ");
			}
			for(int l=3;l<=i; l++) {
				System.out.print("  ");
			}
			if(i>=2) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}


//        * 
//      *   *
//    *       *
//  *           *
//*               *