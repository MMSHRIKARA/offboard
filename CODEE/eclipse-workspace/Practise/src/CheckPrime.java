package com.prac.sujit;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=6;
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0){
        		System.out.println(false+" is not a prime number");
        		break;
        	}
        	else {
        		System.out.println(true+" is a prime number");
        		break;
        	}
        }
	}
}
