package com.prac.sujit;

public class Pells{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=1;
        int b=0;
        int c=0;
        for(int i=0;i<=10;i++) {
        	c=a+(2*b);
        	a=b;
        	b=c;
        	System.out.print(c+"  ");
        }
        
	}

}
