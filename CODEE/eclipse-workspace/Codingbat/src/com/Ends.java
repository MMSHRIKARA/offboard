package com;

public class Ends{
	   public static boolean endsLy(String str) {
		   if(str.length()>1) {
			   if(str.substring(str.length()-2).equals("ly")) {
				   return true;
			   }
			   else {
				   return false;
			   }
			   
		   }
		   else {
			   return false;
		   }
	   }
	
	   
	   public static void main(String[] args){
	      System.out.println(Ends.endsLy("y"));
	      System.out.println(Ends.endsLy("Oddly"));
	}
}