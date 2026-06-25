package com.prac.sujit;

import java.util.Arrays;

public class SortAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="abcba";
      char[] arrpal=str.toCharArray();
      char[] arr=str.toCharArray();
      Arrays.sort(arr);
      System.out.println(arr); 
      String rev="";
      for(int i=arrpal.length-1;i>=0;i--) {
    	  rev=rev+arrpal[i];
      }
      System.out.println(rev);
      if(rev.equals(str)) {
    	  System.out.println(true);
      }
      else {
    	  System.out.println(false);
      }
	}
}
