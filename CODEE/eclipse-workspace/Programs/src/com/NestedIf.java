package com;

//public class NestedIf {
//	public static void main(String[] args) {
//		char id = 'a';
//		int password = 123;
//		
//		if(id == 'a') {
//			System.out.println("user id is valid");
//			if(password == 123) {
//				System.out.println("Password is valid");
//				System.out.println("Login is successful");
//			}
//			else {
//				System.out.println("Password is invalid");
//				System.out.println("Login is Unsuccessful");
//			}
//		}
//		else {
//			System.out.println("user id is invalid");
//			System.out.println("Login is Unsuccessful");
//		}
//	}
//
//}

public class NestedIf{
	public static void main(String[] args) {
		String LockerName = "Langpo";
		int LockerPassword = 908070;
		
		if(LockerName == "Langpo") {
			System.out.println("LockerName is valid");
			if(LockerPassword == 908070) {
				System.out.println("LockerPassword is valid");
				System.out.println("Locker Opened Successfully");
			}
			else {
				System.out.println("LockerPassword is Invalid");
				System.out.println("Locker failed to open Successfully");
			}
		}
		else {
			System.out.println("LockerName is invalid");
			System.out.println("Locker failed to open Successfully");
		}
	}
}
