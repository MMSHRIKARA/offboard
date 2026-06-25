package com.prac.sujit;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=123521;
        int dup=num;
        int revNum=0;
        while(dup>0) {
        	int lastdigit=dup%10;
        	revNum=revNum*10+lastdigit;
        	dup=dup/10;
        }
        System.out.println(revNum);
        if(num==revNum) {
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }
	}

}
