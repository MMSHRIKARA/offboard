package com;

//*               * 
//  *           * 
//    *       * 
//      *   * 
//        * 
public class StarPattern10b {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			for(int k=3; k>=i; k--) {
				System.out.print("  ");
			}
			if(i<=4) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
                
//*               *
//  *           *
//    *       *
//      *   * 
//        *       