//package com;
//
//public class Toggle {
//	public static void main(String[] args) {
//		String arr[]= {"Rohan", "Manoj","Bhuvan","Uday"};
//		for(int i=0; i<arr.length; i++) {
//			char ch[]=arr[i].toCharArray();
//			if(Character.isUpperCase(ch[1])) {
//				ch[1]=Character.toUpperCase(ch[1]);
//			}
//			else if()
//		}
//	}
//
//}

package com;
class Toggle{
	static void s() {
		System.out.println("s");
	}
}
class To extends Toggle{
	static void s() {
		System.out.println("sl");
	}
	public static void main(String[] args) {
		To t = new To();
		Toggle.s();
		System.out.println(0/0);
	}
}