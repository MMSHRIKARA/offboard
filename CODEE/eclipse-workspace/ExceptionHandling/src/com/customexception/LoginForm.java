package com.customexception;

public class LoginForm {
	public static void main(String[] args) {
		String id = "Kaizer";
		int pwd = 882;
		if(id.equals("Kaizer")) {
			if(pwd == 8828) {
				System.out.println("Login Successfull");
			}
			else {
//				InvalidPasswordException e = new InvalidPasswordException();
//				throw e;
				try {
					
				throw new InvalidPasswordException();
				}
				catch(InvalidPasswordException e) {
					System.out.println("Invalid Password");
				}
			}
		}
		else {
			try {
				
		throw new InvalidUsernameException();
			}
			catch(InvalidUsernameException e) {
				System.out.println("Invalid UserName");
			}
		}
	}

}
