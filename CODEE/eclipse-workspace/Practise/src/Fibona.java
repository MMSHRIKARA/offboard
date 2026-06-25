package com.prac.sujit;

public class Fibona{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0;
        int b=1;
        for(int i=2;i<=10;i++) {
        	int c=a+b;
        	System.out.print(a+" ");
        	a=b;
        	b=c;
        }
	}

}
