package com;

import java.util.ArrayList;
import java.util.List;

interface ConvertCase{

List cases(List a);
}
public class LambdaCnverttoUCaseNLCase {
	public static void main(String[] args) {
		ConvertCase cc = (a)->{
			for(Object l : a) {
				String s = (String) l;
				 
				
			}
			return l;
			
		};
		List<String> list = new ArrayList();
		list.add("Hello");
		list.add("World");
		System.out.println(cc.cases(list));
		
	}

}
