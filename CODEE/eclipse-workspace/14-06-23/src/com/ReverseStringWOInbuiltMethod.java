package com;

public class ReverseStringWOInbuiltMethod {
		public static void main(String[] args){
		String str = "Capgemini", revstr="";
		char ch [] = str.toCharArray(); 
		int count = 0;
		for(int i=1; i<=ch.length; i++){
		count++;
		}
		System.out.println(count);
		for(int j=count-1; j>=0; j--){
		revstr+=ch[j];
		}
		System.out.println(revstr);



}
}
